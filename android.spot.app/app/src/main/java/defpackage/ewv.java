package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.BidiFormatter;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ewv {
    public static final jnk a = jnk.l("com/google/android/apps/adm/suggestedaction/SuggestedActionCardValuesSupplier");
    public final Context b;
    public final BidiFormatter c;
    public final efy d;
    public final ele e;
    public final ejo f;
    public final jer g;
    public final cfk h;
    public final ebf i;
    public final emx j;
    public final ehm k;
    public final exa l;
    public final gml m;
    public final nca n;
    private final emm o;
    private final ewg p;

    public ewv(Context context, ag agVar, ebf ebfVar, BidiFormatter bidiFormatter, emm emmVar, ewg ewgVar, nca ncaVar, ele eleVar, efy efyVar, ejo ejoVar, emx emxVar, gml gmlVar, ehm ehmVar, cfk cfkVar, exa exaVar) {
        jer jerVar;
        this.b = context;
        this.i = ebfVar;
        this.c = bidiFormatter;
        this.o = emmVar;
        this.p = ewgVar;
        this.n = ncaVar;
        this.d = efyVar;
        this.e = eleVar;
        this.f = ejoVar;
        this.j = emxVar;
        this.m = gmlVar;
        this.k = ehmVar;
        this.h = cfkVar;
        this.l = exaVar;
        Bundle bundle = agVar.m;
        if (bundle != null) {
            jerVar = eyf.d(bundle);
        } else {
            jerVar = jdl.a;
        }
        this.g = jerVar;
        emmVar.b(new exw() { // from class: ewt
            @Override // defpackage.exw
            public final void a(boolean z) {
            }
        });
    }

    private static final String i() {
        if (Build.VERSION.SDK_INT >= 31) {
            return "com.google.android.gms.settings.FIND_MY_DEVICE_SETTINGS";
        }
        return "com.google.android.gms.settings.ADM_SETTINGS";
    }

    public final jer a() {
        jer jerVar = this.g;
        if (!jerVar.g()) {
            return jdl.a;
        }
        return eyf.b(this.p.c(), (lqd) jerVar.c());
    }

    public final String b(int i) {
        return this.b.getString(i);
    }

    public final void c(String str) {
        if (str.isEmpty()) {
            ((jni) ((jni) a.f()).j("com/google/android/apps/adm/suggestedaction/SuggestedActionCardValuesSupplier", "openUrl", 547, "SuggestedActionCardValuesSupplier.java")).r("URL is empty.");
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.addFlags(268435456);
        try {
            this.b.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            ((jni) ((jni) ((jni) a.f()).i(e)).j("com/google/android/apps/adm/suggestedaction/SuggestedActionCardValuesSupplier", "openUrl", (char) 555, "SuggestedActionCardValuesSupplier.java")).r("Failed to open URL for a suggested action.");
        }
    }

    public final void d() {
        emm emmVar = this.o;
        jdl jdlVar = jdl.a;
        emmVar.c(jdlVar, jdlVar);
    }

    public final /* synthetic */ void e() {
        try {
            this.i.a.startActivity(new Intent(i()).putExtra("open_fmdn", true));
        } catch (ActivityNotFoundException e) {
            ((jni) ((jni) ((jni) a.f()).i(e)).j("com/google/android/apps/adm/suggestedaction/SuggestedActionCardValuesSupplier", "lambda$enableFindMyDeviceNetworkCardValues$15", (char) 378, "SuggestedActionCardValuesSupplier.java")).r("Failed opening the Find My Device Network settings activity");
        }
    }

    public final /* synthetic */ void f() {
        try {
            this.b.startActivity(new Intent("android.settings.WIRELESS_SETTINGS").addFlags(268435456));
        } catch (ActivityNotFoundException e) {
            ((jni) ((jni) ((jni) a.f()).i(e)).j("com/google/android/apps/adm/suggestedaction/SuggestedActionCardValuesSupplier", "lambda$enableInternetConnectionCardValues$24", (char) 507, "SuggestedActionCardValuesSupplier.java")).r("Failed to open wireless settings.");
        }
    }

    public final /* synthetic */ void g() {
        try {
            this.i.a.startActivity(new Intent(i()).putExtra("open_fmdn", true));
        } catch (ActivityNotFoundException e) {
            ((jni) ((jni) ((jni) a.f()).i(e)).j("com/google/android/apps/adm/suggestedaction/SuggestedActionCardValuesSupplier", "lambda$findMyDeviceNetworkAllAreasCardValues$16", (char) 404, "SuggestedActionCardValuesSupplier.java")).r("Failed opening the Find My Device Network settings activity");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void h() {
        try {
            this.i.a.startActivity(new Intent(i()));
        } catch (ActivityNotFoundException e) {
            ((jni) ((jni) ((jni) a.f()).i(e)).j("com/google/android/apps/adm/suggestedaction/SuggestedActionCardValuesSupplier", "lambda$getCardValuesForSuggestedAction$2", (char) 172, "SuggestedActionCardValuesSupplier.java")).r("Failed opening the Find My Device settings activity");
        }
    }
}
