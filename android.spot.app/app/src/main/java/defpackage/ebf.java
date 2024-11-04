package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.adm.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ebf extends eba {
    private static final jnk c = jnk.l("com/google/android/apps/adm/display/MainDisplayImpl");
    public final ddg b;
    private final jer d;

    public ebf(Activity activity, ddg ddgVar, jer jerVar) {
        super((cs) activity);
        this.b = ddgVar;
        this.d = jerVar;
    }

    private final jer t() {
        ag e = a().e(R.id.main_fragment);
        if (!(e instanceof dzb)) {
            return jdl.a;
        }
        return jer.i((dzb) e);
    }

    private final void u() {
        f fVar;
        if (a().a() > 0) {
            be a = a();
            be a2 = a();
            if (a2.b.size() == 0) {
                fVar = a2.e;
                if (fVar == null) {
                    throw new IndexOutOfBoundsException();
                }
            } else {
                fVar = (f) a2.b.get(0);
            }
            int i = fVar.c;
            if (i >= 0) {
                a.ae(null, i, 1);
                return;
            }
            throw new IllegalArgumentException(a.ae(i, "Bad id: "));
        }
    }

    public final ag b() {
        return a().f("fullscreen_auth");
    }

    public final jer c() {
        return t().b(new dvh(9));
    }

    public final void d() {
        v vVar = (v) a().f("lock_device_fragment");
        if (vVar != null) {
            vVar.d();
        }
        if (a().f("set_password_fragment") != null) {
            a().ad();
        }
    }

    public final void e(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        intent.addFlags(268435456);
        try {
            this.a.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
        }
    }

    public final void f() {
        ag b = b();
        if (b != null) {
            f fVar = new f(a());
            fVar.k(b);
            fVar.b();
        }
    }

    public final void g() {
        u();
        ag f = a().f("main_frag");
        if (f != null) {
            f fVar = new f(a());
            fVar.k(f);
            fVar.b();
        }
    }

    public final void h(int i) {
        this.a.findViewById(R.id.container_map).setVisibility(i);
    }

    public final void i(lqd lqdVar) {
        if (a().f("device_details_frag") == null) {
            ehy a = ehy.a(lqdVar);
            ebb a2 = ebc.a();
            a2.a = "device_details_frag";
            a2.c(false);
            a2.b(true);
            k(a, a2.a());
        }
    }

    public final void j(ag agVar) {
        k(agVar, ebc.a().a());
    }

    public final void k(ag agVar, ebc ebcVar) {
        f fVar = new f(a());
        if (ebcVar.d) {
            fVar.u(R.anim.slide_in_from_right, R.anim.slide_out_to_left, R.anim.slide_in_from_left, R.anim.slide_out_to_right);
        }
        fVar.t(R.id.main_fragment, agVar, ebcVar.a);
        fVar.r(ebcVar.b);
        fVar.m(agVar);
        fVar.h();
        if (ebcVar.c) {
            a().ag();
        }
    }

    public final void l(ag agVar) {
        int i = 2;
        ((Boolean) c().b(new dyv(new ebd(agVar, i), i)).e(false)).booleanValue();
    }

    public final void m(lqd lqdVar, boolean z, boolean z2) {
        ehf ehfVar;
        if (z2) {
            ehfVar = ehf.MARK_AS_LOST;
        } else {
            ehfVar = ehf.SECURE_DEVICE;
        }
        ehg ehgVar = new ehg();
        Bundle bundle = new Bundle();
        eyf.m(lqdVar, bundle);
        bundle.putString("UI_TYPE", ehfVar.name());
        bundle.putBoolean("HAS_CAR_KEYS", z);
        ehgVar.ak(bundle);
        ebb a = ebc.a();
        a.b(true);
        k(ehgVar, a.a());
    }

    public final void n() {
        if (!ltu.c()) {
            cs csVar = this.a;
            cs csVar2 = this.a;
            String string = csVar.getString(R.string.security_checkup_secure_device_title);
            String string2 = csVar2.getString(R.string.security_checkup_message);
            if (a().f("security_checkup_dialog") == null) {
                eci eciVar = new eci();
                Bundle bundle = new Bundle();
                bundle.putString("dialog_title", string);
                bundle.putString("dialog_message", string2);
                eciVar.ak(bundle);
                eciVar.q(a(), "security_checkup_dialog");
                a().ag();
            }
        }
    }

    public final void o() {
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", this.a.getPackageName(), null));
        intent.addFlags(268435456);
        try {
            this.a.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            ((jni) ((jni) ((jni) c.f()).i(e)).j("com/google/android/apps/adm/display/MainDisplayImpl", "startAppSettings", (char) 278, "MainDisplayImpl.java")).r("Failed to start app settings activity");
        }
    }

    public final void p(int i) {
        BottomSheetBehavior i2;
        jer t = t();
        if (t.g() && (i2 = ((dzb) t.c()).a.i()) != null) {
            i2.H(i);
        }
    }

    public final boolean q() {
        return a().f("DEVICE_UI_FRAGMENT_TAG") instanceof dzb;
    }

    public final boolean r() {
        u();
        if (b() == null) {
            f fVar = new f(a());
            fVar.t(R.id.main_fragment, new ebl(), "fullscreen_auth");
            fVar.b();
            return true;
        }
        return false;
    }

    public final boolean s() {
        u();
        if (a().f("main_frag") != null) {
            return false;
        }
        ag agVar = (ag) this.d.b(new dvh(8)).d(new eft(1));
        f fVar = new f(a());
        fVar.t(R.id.main_fragment, agVar, "main_frag");
        if (a().f("device_map_frag") == null) {
            fVar.t(R.id.container_map, new eur(), "device_map_frag");
        }
        fVar.b();
        return true;
    }
}
