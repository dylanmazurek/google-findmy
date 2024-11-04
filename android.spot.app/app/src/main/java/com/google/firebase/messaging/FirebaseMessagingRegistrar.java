package com.google.firebase.messaging;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.faf;
import defpackage.hwx;
import defpackage.knh;
import defpackage.knt;
import defpackage.knu;
import defpackage.knv;
import defpackage.koc;
import defpackage.kox;
import defpackage.kqf;
import defpackage.kql;
import defpackage.kqy;
import defpackage.krd;
import defpackage.kti;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(knv knvVar) {
        return new FirebaseMessaging((knh) knvVar.e(knh.class), (kqy) knvVar.e(kqy.class), knvVar.b(kti.class), knvVar.b(kql.class), (krd) knvVar.e(krd.class), (faf) knvVar.e(faf.class), (kqf) knvVar.e(kqf.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        knt b = knu.b(FirebaseMessaging.class);
        b.a = LIBRARY_NAME;
        b.b(new koc(knh.class, 1, 0));
        b.b(new koc(kqy.class, 0, 0));
        b.b(new koc(kti.class, 0, 1));
        b.b(new koc(kql.class, 0, 1));
        b.b(new koc(faf.class, 0, 0));
        b.b(new koc(krd.class, 1, 0));
        b.b(new koc(kqf.class, 1, 0));
        b.c = new kox(11);
        b.c();
        return Arrays.asList(b.a(), hwx.an(LIBRARY_NAME, "23.3.2_1p"));
    }
}
