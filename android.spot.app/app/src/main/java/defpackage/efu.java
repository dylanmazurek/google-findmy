package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.text.BidiFormatter;
import com.google.android.apps.adm.R;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class efu implements edb {
    public static final jnk a = jnk.l("com/google/android/apps/adm/integrations/android/AndroidRingingViewModelDelegate");
    public final efy b;
    public ewk c;
    public cfn d = null;
    private final Context e;
    private final ewg f;
    private final BidiFormatter g;
    private final lra h;
    private final lqd i;
    private final ees j;

    public efu(Context context, efy efyVar, ewg ewgVar, BidiFormatter bidiFormatter, ees eesVar, lra lraVar, cfz cfzVar) {
        this.e = context;
        this.b = efyVar;
        this.f = ewgVar;
        this.g = bidiFormatter;
        this.j = eesVar;
        this.h = lraVar;
        this.i = eyf.h(cfzVar);
    }

    private final lqc g() {
        return (lqc) eyf.b(this.f.c(), this.i).d(new eft(0));
    }

    @Override // defpackage.edb
    public final cfk a() {
        cfn cfnVar = this.d;
        cfnVar.getClass();
        return cfnVar;
    }

    @Override // defpackage.edb
    public final void b() {
        if (this.d != null) {
            return;
        }
        this.d = new cfn(c());
        dym dymVar = new dym(this, 11, null);
        this.c = dymVar;
        this.b.d(dymVar);
        this.h.a(new elp(this, 1));
    }

    public final eda c() {
        jer jerVar;
        efy efyVar = this.b;
        lqc g = g();
        efp a2 = efyVar.a(this.i);
        a2.getClass();
        HashMap k = eyf.k(g);
        eir eirVar = new eir(null, null);
        int i = 1;
        eirVar.g(true);
        eirVar.d = jer.i(this.e.getString(R.string.ring_device_message_1, this.g.unicodeWrap(g().g)));
        long longValue = ((Long) a2.l().e(0L)).longValue() - SystemClock.elapsedRealtime();
        if (longValue > 0) {
            jerVar = jer.i(Integer.valueOf((int) longValue));
        } else {
            jerVar = jdl.a;
        }
        if (jerVar.g()) {
            if (a2.m().g()) {
                i = 4;
            } else {
                i = 3;
            }
        } else if (a2.j().g()) {
            i = 2;
        }
        eirVar.e = i;
        eirVar.c = a2.k();
        eirVar.a = a2.l();
        eirVar.b = jdl.a;
        eirVar.h(k.containsKey(lpk.ANDROID_STOP_SOUND));
        return eirVar.f();
    }

    @Override // defpackage.edb
    public final void d(kzl kzlVar) {
        throw new UnsupportedOperationException("Cannot ring locally with ringing volume for an Android device.");
    }

    @Override // defpackage.edb
    public final void e() {
        this.j.a(this.i, lpk.ANDROID_MAKE_SOUND);
    }

    @Override // defpackage.edb
    public final void f() {
        this.j.a(this.i, lpk.ANDROID_STOP_SOUND);
    }
}
