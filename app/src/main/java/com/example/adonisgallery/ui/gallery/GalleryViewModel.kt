package com.example.adonisgallery.ui.gallery

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.example.adonisgallery.data.UnsplashRepository

class GalleryViewModel @ViewModelInject constructor(private  val repository: UnsplashRepository) : ViewModel() {
}