package androidx.media;

import android.media.AudioAttributes;
import defpackage.cnz;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(cnz cnzVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.a = (AudioAttributes) cnzVar.b(audioAttributesImplApi21.a, 1);
        audioAttributesImplApi21.b = cnzVar.a(audioAttributesImplApi21.b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, cnz cnzVar) {
        cnzVar.i(audioAttributesImplApi21.a, 1);
        cnzVar.h(audioAttributesImplApi21.b, 2);
    }
}
