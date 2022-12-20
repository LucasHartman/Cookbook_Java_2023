import org.lwjgl.openal.AL;
import org.lwjgl.openal.ALC;

import lombok.launch.PatchFixesHider.Util;

import static org.lwjgl.openal.AL10.*;
import static org.lwjgl.openal.ALC10.*;

import org.jcp.xml.dsig.internal.dom.Utils;

public class AudioThread extends Thread 
{
    static final int BUFFER_SITE = 512;
    static final int BUFFER_COUNT = 8;

    private final int[] buffers = new int[BUFFER_COUNT];
    private final long device = alcOpenDevice(alcGetString(0, ALC_DEFAULT_DEVICE_SPECIFIER));
    private final long context = alcCreateContext(device, new int[1]);
    private final int source;

    private int bufferIndex;
    private boolean closed;
    private boolean running;

    AudioThread() 
    {
        alcMakeContextCurrent(context);
        AL.createCapabilities(ALC.createCapabilities(device));
        source = alGenSources();
        for (int i=0; i<BUFFER_COUNT; i++) 
        {
            // buffer samples
        }
        alSourcePlay(source);
        catchInternalException();
        start();
    }

    @Override
    public synchronized void run()
    {
        while (!closed)
        {
            while (!running)
            {
                Utils.handleProcedure(this::wait, false);
            }
            int processedBufs = alGetSourcei(source, AL_BUFFER);
            // YOU ARE HERE 25:30
            // https://www.youtube.com/watch?v=q09cNItGhLQ
        }
    }


    private void bufferSamples(short[] samples) 
    {
        int buf = buffers[bufferIndex++];
        alBufferData(buf, AL_FORMAT_MONO16, samples, Synthesizer.AudioInfo.SAMPLE_RATE);
        alSourceQueueBuffers(source,buf);
        bufferIndex %= BUFFER_COUNT; // 8 % 8 = 0 left-over 
    }

    private void catchInternalException() 
    {
        int err = alcGetError(device);
        if (err != ALC_NO_ERROR)
        {
            throw new OpenALException(err);
        }
    }
}