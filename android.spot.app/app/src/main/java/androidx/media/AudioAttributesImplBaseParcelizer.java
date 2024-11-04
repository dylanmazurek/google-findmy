package androidx.media;

import defpackage.cnz;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(cnz cnzVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = cnzVar.a(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.b = cnzVar.a(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = cnzVar.a(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = cnzVar.a(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, cnz cnzVar) {
        cnzVar.h(audioAttributesImplBase.a, 1);
        cnzVar.h(audioAttributesImplBase.b, 2);
        cnzVar.h(audioAttributesImplBase.c, 3);
        cnzVar.h(audioAttributesImplBase.d, 4);
    }
}
