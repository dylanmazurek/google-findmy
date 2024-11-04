package androidx.media;

import android.media.AudioAttributes;
import defpackage.cnz;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(cnz cnzVar) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.a = (AudioAttributes) cnzVar.b(audioAttributesImplApi26.a, 1);
        audioAttributesImplApi26.b = cnzVar.a(audioAttributesImplApi26.b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, cnz cnzVar) {
        cnzVar.i(audioAttributesImplApi26.a, 1);
        cnzVar.h(audioAttributesImplApi26.b, 2);
    }
}
