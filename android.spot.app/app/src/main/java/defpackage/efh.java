package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.adm.R;
import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class efh extends egb implements eez {
    public static final jnk am = jnk.l("com/google/android/apps/adm/integrations/android/AndroidDevicePanelFragment");
    public static final Map an = (Map) DesugarArrays.stream(dyj.values()).collect(jgr.a(Function$CC.identity(), new eff(0)));
    public ehr aA;
    public dyr aB;
    public exa aC;
    public ena aD;
    public apc aE;
    public dhx aF;
    private eis aG;
    public jis ao;
    public jiy ap;
    public jer aq;
    public boolean ar;
    public lqd as;
    public jer at;
    public efy au;
    public egh av;
    public evo aw;
    public ewq ax;
    public ejo ay;
    public eev az;

    public efh() {
        jdl jdlVar = jdl.a;
        this.aq = jdlVar;
        this.ar = false;
        this.at = jdlVar;
    }

    private final String aK(long j) {
        return fma.bO(y(), System.currentTimeMillis() - (SystemClock.elapsedRealtime() - j), R.string.spot_device_status_in_range, R.string.spot_device_status_nearby_today, R.string.spot_device_status_nearby_yesterday, R.string.spot_device_status_nearby_lately, new String[0]);
    }

    private final void aL(int i) {
        aI(new evh(i));
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [evy, java.lang.Object] */
    private final boolean aM() {
        String str;
        int parseInt;
        if (this.aq.g()) {
            Object c = this.aq.c();
            Context y = y();
            if (((eey) c).a.b() != null) {
                try {
                    int applicationEnabledSetting = y.getPackageManager().getApplicationEnabledSetting("com.google.android.apps.maps");
                    if ((applicationEnabledSetting == 1 || applicationEnabledSetting == 0) && (str = y.getPackageManager().getPackageInfo("com.google.android.apps.maps", 0).versionName) != null && str.length() != 0) {
                        String[] split = str.split("\\.");
                        if (split.length >= 2 && ((parseInt = Integer.parseInt(split[0])) == 9 ? Integer.parseInt(split[1]) >= 20 : parseInt > 9)) {
                            return true;
                        }
                    }
                } catch (PackageManager.NameNotFoundException | NumberFormatException | IllegalArgumentException unused) {
                }
            }
        }
        return false;
    }

    @Override // defpackage.ecr, defpackage.ag
    public final View J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View J = super.J(layoutInflater, viewGroup, bundle);
        this.aj.setVisibility(0);
        this.aj.setOnClickListener(new efe(this, 0));
        this.ak.setOnClickListener(new efe(this, 2));
        return J;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03cd  */
    /* JADX WARN: Type inference failed for: r5v3, types: [android.text.SpannableStringBuilder, android.text.Spannable] */
    @Override // defpackage.eez
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.lqc r25, defpackage.efp r26, int r27) {
        /*
            Method dump skipped, instructions count: 1102
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.efh.a(lqc, efp, int):void");
    }

    public final void aI(evh evhVar) {
        this.aw.e(F(), evhVar);
    }

    @Override // defpackage.ag
    public final void aa(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.device_actions, menu);
    }

    @Override // defpackage.ag
    public final void ae(Menu menu) {
        MenuItem findItem = menu.findItem(R.id.action_rename_device);
        if (findItem != null) {
            findItem.setVisible(this.ar);
        }
    }

    @Override // defpackage.ag
    public final void ag(View view, Bundle bundle) {
        this.aC.h(1).g(O(), new qk(this, 18));
        ((cfk) this.aE.b).g(O(), new qk(this, 19));
        ((efm) new ddh((cgq) this).q(efm.class)).a.g(O(), new qk(this, 20));
    }

    @Override // defpackage.ag
    public final boolean ay(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.action_rename_device) {
            this.az.a(dyj.RENAME, this.as);
            return true;
        }
        return false;
    }

    @Override // defpackage.eez
    public final void b(int i) {
        switch (i - 1) {
            case 4:
                aL(R.string.lock_result_success);
                return;
            case 5:
                aL(R.string.lock_result_fail);
                return;
            case 6:
                aL(R.string.lock_result_already_locked);
                return;
            case 7:
                if (!ltu.c() && !ltu.g()) {
                    aL(R.string.lock_result_screen_unlocked);
                    return;
                }
                return;
            case 8:
                aL(R.string.rename_result_fail);
                return;
            case 9:
                aL(R.string.wipe_result_requested);
                return;
            case 10:
                aL(R.string.wipe_result_success);
                return;
            case 11:
                aL(R.string.wipe_result_fail);
                return;
            default:
                aL(R.string.wipe_result_requested_for_profile);
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ecr
    public final void d(int i) {
        if (i == dyj.MAKE_SOUND.ordinal()) {
            this.az.a(dyj.MAKE_SOUND, this.as);
            return;
        }
        if (i == dyj.LOCK.ordinal()) {
            this.az.a(dyj.LOCK, this.as);
            return;
        }
        if (i == dyj.MARK_AS_LOST.ordinal()) {
            this.az.a(dyj.MARK_AS_LOST, this.as);
            return;
        }
        if (i == dyj.UNMARK_AS_LOST.ordinal()) {
            this.az.a(dyj.UNMARK_AS_LOST, this.as);
            return;
        }
        if (i == dyj.WIPE.ordinal()) {
            this.az.a(dyj.WIPE, this.as);
        } else if (i == dyj.ENABLE_DEVICE_ADMIN_OR_REMIND.ordinal()) {
            this.az.a(dyj.ENABLE_DEVICE_ADMIN_OR_REMIND, this.as);
        } else {
            if (i == dyj.NAVIGATE.ordinal()) {
                this.az.a(dyj.NAVIGATE, this.as);
                return;
            }
            throw new IllegalArgumentException(a.ae(i, "unexpected button id "));
        }
    }

    @Override // defpackage.ag
    public final void g(Bundle bundle) {
        super.g(bundle);
        aD();
        this.as = eyf.g(A());
        jin jinVar = new jin();
        jiu jiuVar = new jiu();
        int ordinal = dyj.MAKE_SOUND.ordinal();
        String T = T(R.string.ring);
        Drawable a = bqq.a(y(), R.drawable.gs_sound_sensing_vd_theme_24);
        a.getClass();
        ecq ecqVar = new ecq(ordinal, T, a);
        int ordinal2 = dyj.LOCK.ordinal();
        String T2 = T(R.string.secure_device);
        Drawable a2 = bqq.a(y(), R.drawable.gs_lock_vd_theme_24);
        a2.getClass();
        ecq ecqVar2 = new ecq(ordinal2, T2, a2);
        int ordinal3 = dyj.WIPE.ordinal();
        String T3 = T(R.string.erase_device);
        Drawable a3 = bqq.a(y(), R.drawable.gs_phonelink_erase_vd_theme_24);
        a3.getClass();
        ecq ecqVar3 = new ecq(ordinal3, T3, a3);
        int ordinal4 = dyj.ENABLE_DEVICE_ADMIN_OR_REMIND.ordinal();
        String T4 = T(R.string.setup);
        Drawable a4 = bqq.a(y(), R.drawable.gs_phonelink_setup_vd_theme_24);
        a4.getClass();
        ecq ecqVar4 = new ecq(ordinal4, T4, a4);
        int ordinal5 = dyj.NAVIGATE.ordinal();
        String T5 = T(R.string.navigate_to_device);
        Drawable a5 = bqq.a(y(), R.drawable.gs_directions_vd_theme_24);
        a5.getClass();
        Drawable a6 = bqq.a(y(), R.drawable.gs_launch_vd_theme_24);
        a6.getClass();
        ecq ecqVar5 = new ecq(ordinal5, T5, a5, jer.i(a6));
        jinVar.i(ecqVar, ecqVar2);
        jiuVar.d(dyj.MAKE_SOUND, ecqVar);
        jiuVar.d(dyj.LOCK, ecqVar2);
        jiuVar.d(dyj.WIPE, ecqVar3);
        jiuVar.d(dyj.ENABLE_DEVICE_ADMIN_OR_REMIND, ecqVar4);
        jiuVar.d(dyj.NAVIGATE, ecqVar5);
        int ordinal6 = dyj.MARK_AS_LOST.ordinal();
        String T6 = T(R.string.mark_as_lost);
        Drawable a7 = bqq.a(y(), R.drawable.gs_radar_vd_theme_24);
        a7.getClass();
        ecq ecqVar6 = new ecq(ordinal6, T6, a7);
        int ordinal7 = dyj.UNMARK_AS_LOST.ordinal();
        String T7 = T(R.string.spot_unmark_lost);
        Drawable a8 = bqq.a(y(), R.drawable.gs_lock_open_vd_theme_24);
        a8.getClass();
        ecq ecqVar7 = new ecq(ordinal7, T7, a8);
        jinVar.i(ecqVar6, ecqVar7);
        jiuVar.d(dyj.MARK_AS_LOST, ecqVar6);
        jiuVar.d(dyj.UNMARK_AS_LOST, ecqVar7);
        jinVar.i(ecqVar3, ecqVar4, ecqVar5);
        this.ao = jinVar.g();
        this.ap = jiuVar.b();
        ((cfk) this.aF.a).g(this, new egv(this, 1));
        this.aD.g(this.ad, this.as);
    }

    @Override // defpackage.ag
    public final void k() {
        super.k();
        jer g = this.aA.g();
        if (g.g() && (g.c() instanceof efa)) {
            efa efaVar = (efa) g.c();
            efaVar.a();
            boolean z = true;
            hwx.V(!efaVar.d.g(), "UI already attached");
            efaVar.d = jer.i(this);
            ((efh) efaVar.d.c()).aq = jer.i(efaVar.n);
            if (bsf.g(efaVar.i())) {
                efaVar.i = jer.i(new eey(efaVar, (eez) this));
                Object c = efaVar.c.c();
                Object c2 = efaVar.i.c();
                ((dxu) c).a();
                elc elcVar = (elc) c;
                if (elcVar.g != null) {
                    z = false;
                }
                hwx.V(z, "UI already attached");
                elcVar.g = (eey) c2;
            } else {
                efaVar.i = jdl.a;
            }
            efaVar.f();
            this.at = jer.i(efaVar);
        }
        this.av.f();
    }

    @Override // defpackage.ag
    public final void l() {
        boolean z;
        if (this.aq.g()) {
            Object c = this.aq.c();
            eey eeyVar = (eey) c;
            hwx.V(((efa) eeyVar.b).d.g(), "UI not attached");
            if (((efa) eeyVar.b).d.c() == this) {
                z = true;
            } else {
                z = false;
            }
            hwx.K(z, "detaching wrong UI");
            jdl jdlVar = jdl.a;
            this.aq = jdlVar;
            efa efaVar = (efa) eeyVar.b;
            efaVar.d = jdlVar;
            efaVar.e(new ah(c, 6));
        }
        this.at = jdl.a;
        super.l();
    }
}
