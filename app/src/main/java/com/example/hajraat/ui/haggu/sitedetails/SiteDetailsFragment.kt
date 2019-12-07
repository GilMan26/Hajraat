package com.example.hajraat.ui.haggu.sitedetails

import android.app.Activity
import android.content.ContentResolver
import android.content.Intent
import android.graphics.Bitmap
import android.media.MediaRecorder
import android.os.Bundle
import android.os.Environment
import android.provider.MediaStore
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.hajraat.ui.models.SiteUI
import kotlinx.android.synthetic.main.fragment_site_details.*
import kotlinx.android.synthetic.main.row_item_site.*


class SiteDetailsFragment : Fragment() {

    lateinit var siteUI: SiteUI
    private lateinit var viewModel: SiteDetailsViewModel
    var recorder = MediaRecorder()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        siteUI=arguments?.getSerializable("data") as SiteUI
        return inflater.inflate(R.layout.fragment_site_details, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(SiteDetailsViewModel::class.java)
        // TODO: Use the ViewModel
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecorder()
        nameTV.text=siteUI.name
        cameraBtn.setOnClickListener {
            startActivity(Intent(MediaStore.ACTION_IMAGE_CAPTURE))
        }
        recordBtn.setOnClickListener {
            recorder.start()
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when (requestCode) {
            TAKE_PICTURE -> if (resultCode === Activity.RESULT_OK) {
                val selectedImage: Uri = imageUri
                getContentResolver().notifyChange(selectedImage, null)
                val imageView: ImageView = findViewById(R.id.ImageView) as ImageView
                val cr: ContentResolver = getContentResolver()
                val bitmap: Bitmap
                try {
                    bitmap = MediaStore.Images.Media
                        .getBitmap(cr, selectedImage)
                    imageView.setImageBitmap(bitmap)
                    Toast.makeText(
                        this, selectedImage.toString(),
                        Toast.LENGTH_LONG
                    ).show()
                } catch (e: Exception) {
                    Toast.makeText(this, "Failed to load", Toast.LENGTH_SHORT)
                        .show()
                    Log.e("Camera", e.toString())
                }
            }
        }
    }

    fun setupRecorder(){
        val path = Environment.getDownloadCacheDirectory().getAbsolutePath()
        recorder.setAudioSource(MediaRecorder.AudioSource.MIC)
        recorder.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP)
        recorder.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB)
        recorder.setOutputFile(path)
        recorder.prepare()
    }

}
