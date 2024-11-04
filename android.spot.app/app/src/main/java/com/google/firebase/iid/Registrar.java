package com.google.firebase.iid;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.hwx;
import defpackage.knh;
import defpackage.knt;
import defpackage.knu;
import defpackage.knv;
import defpackage.koc;
import defpackage.kox;
import defpackage.kql;
import defpackage.kqn;
import defpackage.kqs;
import defpackage.kqt;
import defpackage.kqy;
import defpackage.krd;
import defpackage.kti;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class Registrar implements ComponentRegistrar {
    public static /* synthetic */ FirebaseInstanceId lambda$getComponents$0(knv knvVar) {
        knh knhVar = (knh) knvVar.e(knh.class);
        return new FirebaseInstanceId(knhVar, new kqs(knhVar.a()), kqn.a(), kqn.a(), knvVar.b(kti.class), knvVar.b(kql.class), (krd) knvVar.e(krd.class));
    }

    public static /* synthetic */ kqy lambda$getComponents$1(knv knvVar) {
        return new kqt((FirebaseInstanceId) knvVar.e(FirebaseInstanceId.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        knt b = knu.b(FirebaseInstanceId.class);
        b.b(new koc(knh.class, 1, 0));
        b.b(new koc(kti.class, 0, 1));
        b.b(new koc(kql.class, 0, 1));
        b.b(new koc(krd.class, 1, 0));
        b.c = new kox(8);
        b.c();
        knu a = b.a();
        knt b2 = knu.b(kqy.class);
        b2.b(new koc(FirebaseInstanceId.class, 1, 0));
        b2.c = new kox(9);
        return Arrays.asList(a, b2.a(), hwx.an("fire-iid", "21.1.1"));
    }
}
