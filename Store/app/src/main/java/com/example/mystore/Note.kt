package com.example.mystore

import android.media.Image

class Note {

    var id: Int? = null
    var title: String? = null
    var content: Int? = null
    var image: ByteArray? = null
    constructor(id: Int, title: String, content: Int) {
        this.id = id
        this.title = title
        this.content = content
    }
    constructor(id: Int, title: String, content: Int, image: ByteArray) {
        this.id = id
        this.title = title
        this.content = content
        this.image = image
    }
}