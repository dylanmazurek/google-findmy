package com.google.firebase.datatransport;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.faf;
import defpackage.fah;
import defpackage.hwx;
import defpackage.knt;
import defpackage.knu;
import defpackage.knv;
import defpackage.koc;
import defpackage.kon;
import defpackage.kox;
import defpackage.koz;
import defpackage.kpa;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    public static /* synthetic */ faf lambda$getComponents$0(knv knvVar) {
        fah.b((Context) knvVar.e(Context.class));
        return fah.a().c();
    }

    public static /* synthetic */ faf lambda$getComponents$1(knv knvVar) {
        fah.b((Context) knvVar.e(Context.class));
        return fah.a().c();
    }

    public static /* synthetic */ faf lambda$getComponents$2(knv knvVar) {
        fah.b((Context) knvVar.e(Context.class));
        return fah.a().c();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        knt b = knu.b(faf.class);
        b.a = LIBRARY_NAME;
        b.b(new koc(Context.class, 1, 0));
        b.c = new kox(4);
        knt a = knu.a(new kon(koz.class, faf.class));
        a.b(new koc(Context.class, 1, 0));
        a.c = new kox(5);
        knt a2 = knu.a(new kon(kpa.class, faf.class));
        a2.b(new koc(Context.class, 1, 0));
        a2.c = new kox(6);
        return Arrays.asList(b.a(), a.a(), a2.a(), hwx.an(LIBRARY_NAME, "19.0.0_1p"));
    }
}
