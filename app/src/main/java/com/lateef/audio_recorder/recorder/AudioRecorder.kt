package com.lateef.audio_recorder.recorder

import java.io.File

interface AudioRecorder {

    fun start(outputFile: File)

    fun stop()
}