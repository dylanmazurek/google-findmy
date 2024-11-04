package com.google.firebase.installations;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.hwx;
import defpackage.knh;
import defpackage.knt;
import defpackage.knu;
import defpackage.knv;
import defpackage.koc;
import defpackage.kox;
import defpackage.kqi;
import defpackage.kqj;
import defpackage.kqk;
import defpackage.krc;
import defpackage.krd;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    public static /* synthetic */ krd lambda$getComponents$0(knv knvVar) {
        return new krc((knh) knvVar.e(knh.class), knvVar.b(kqk.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        knt b = knu.b(krd.class);
        b.b(new koc(knh.class, 1, 0));
        b.b(new koc(kqk.class, 0, 1));
        b.c = new kox(10);
        return Arrays.asList(b.a(), knu.d(new kqj(), kqi.class), hwx.an("fire-installations", "17.0.2_1p"));
    }
}
