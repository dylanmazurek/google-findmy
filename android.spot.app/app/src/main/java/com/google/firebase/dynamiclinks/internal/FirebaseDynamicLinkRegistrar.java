package com.google.firebase.dynamiclinks.internal;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.fhq;
import defpackage.knh;
import defpackage.knn;
import defpackage.knt;
import defpackage.knu;
import defpackage.knv;
import defpackage.koc;
import defpackage.kox;
import defpackage.kpb;
import defpackage.kpe;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class FirebaseDynamicLinkRegistrar implements ComponentRegistrar {
    public static /* synthetic */ kpb lambda$getComponents$0(knv knvVar) {
        knh knhVar = (knh) knvVar.e(knh.class);
        return new kpb((fhq) new kpe(knhVar.a()), knhVar, knvVar.b(knn.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        knt b = knu.b(kpb.class);
        b.b(new koc(knh.class, 1, 0));
        b.b(new koc(knn.class, 0, 1));
        b.c = new kox(7);
        return Arrays.asList(b.a());
    }
}
