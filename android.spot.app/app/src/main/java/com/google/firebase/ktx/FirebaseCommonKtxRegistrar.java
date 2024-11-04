package com.google.firebase.ktx;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.kni;
import defpackage.kno;
import defpackage.knp;
import defpackage.knq;
import defpackage.knr;
import defpackage.knt;
import defpackage.knu;
import defpackage.koc;
import defpackage.kon;
import defpackage.mkm;
import defpackage.mkp;
import defpackage.mst;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
@mkp
/* loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        knt a = knu.a(new kon(kno.class, mst.class));
        a.b(new koc(new kon(kno.class, Executor.class), 1, 0));
        a.c = kni.e;
        knt a2 = knu.a(new kon(knq.class, mst.class));
        a2.b(new koc(new kon(knq.class, Executor.class), 1, 0));
        a2.c = kni.f;
        knt a3 = knu.a(new kon(knp.class, mst.class));
        a3.b(new koc(new kon(knp.class, Executor.class), 1, 0));
        a3.c = kni.g;
        knt a4 = knu.a(new kon(knr.class, mst.class));
        a4.b(new koc(new kon(knr.class, Executor.class), 1, 0));
        a4.c = kni.h;
        return mkm.P(a.a(), a2.a(), a3.a(), a4.a());
    }
}
