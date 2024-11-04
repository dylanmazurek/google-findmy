package defpackage;

import android.os.Bundle;
import android.view.View;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class edl extends eej {
    public static final jnk am = jnk.l("com/google/android/apps/adm/integrations/accessory/AccessoryDevicePanelFragment");
    public dhx aA;
    public fma aB;
    private ecq aC;
    public evo an;
    public evy ao;
    public ewq ap;
    public eei aq;
    public edv ar;
    public pf as;
    public ecq at;
    public jis au;
    public dyr av;
    public dxf aw;
    public ebf ax;
    public exa ay;
    public elo az;

    public final String aI(String str, long j, lps lpsVar) {
        int i;
        int i2;
        if (this.aB == null) {
            mpd.b("systemClock");
        }
        if (new nod(System.currentTimeMillis()).compareTo(new nod(j)) == 0) {
            if (lpsVar != null) {
                i2 = R.string.accessory_status_last_seen_device_time_only;
            } else {
                i2 = R.string.accessory_status_disconnected_device_time_only;
            }
            String U = U(i2, str, bse.h(j));
            U.getClass();
            return U;
        }
        if (lpsVar != null) {
            i = R.string.accessory_status_last_seen_device_time_and_date;
        } else {
            i = R.string.accessory_status_disconnected_device_time_and_date;
        }
        String h = bse.h(j);
        String bN = fma.bN(j / 1000);
        bN.getClass();
        String U2 = U(i, str, h, bN);
        U2.getClass();
        return U2;
    }

    public final dyr aJ() {
        dyr dyrVar = this.av;
        if (dyrVar != null) {
            return dyrVar;
        }
        mpd.b("mapControls");
        return null;
    }

    public final ebf aK() {
        ebf ebfVar = this.ax;
        if (ebfVar != null) {
            return ebfVar;
        }
        mpd.b("mainDisplay");
        return null;
    }

    @Override // defpackage.ag
    public final void ag(View view, Bundle bundle) {
        view.getClass();
        this.ak.setOnClickListener(new efe(this, 1));
        dhx dhxVar = this.aA;
        if (dhxVar == null) {
            mpd.b("notificationMessageHandler");
            dhxVar = null;
        }
        ((cfk) dhxVar.a).g(O(), new edk(new eeo(this, 1), 0));
        exa exaVar = this.ay;
        if (exaVar == null) {
            mpd.b("suggestedActionProvider");
            exaVar = null;
        }
        exaVar.h(3).g(O(), new edk(new dhs((Object) this, 2, (char[]) null), 0));
        mpp.q(bsv.c(O()), null, 0, new eau(this, (mmx) null, 7, (byte[]) null), 3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ecr
    public final void d(int i) {
        if (i == 0) {
            dxf dxfVar = this.aw;
            lps lpsVar = null;
            if (dxfVar == null) {
                mpd.b("fmdClearcutLogger");
                dxfVar = null;
            }
            lnb lnbVar = lnb.NAVIGATE_REQUESTED;
            jdl jdlVar = jdl.a;
            edv edvVar = this.ar;
            if (edvVar == null) {
                mpd.b("viewModel");
                edvVar = null;
            }
            dxfVar.c(lnbVar, jdlVar, edvVar.c);
            edv edvVar2 = this.ar;
            if (edvVar2 == null) {
                mpd.b("viewModel");
                edvVar2 = null;
            }
            eeb eebVar = ((eds) edvVar2.d.c()).b;
            if (eebVar != null) {
                lpsVar = bse.g(eebVar);
            }
            if (lpsVar == null) {
                ((jni) am.f().j("com/google/android/apps/adm/integrations/accessory/AccessoryDevicePanelFragment", "onNavigationRequested", 311, "AccessoryDevicePanelFragment.kt")).r("Unexpected NAVIGATE action without a valid location");
                return;
            }
            lnr lnrVar = lpsVar.b;
            if (lnrVar == null) {
                lnrVar = lnr.c;
            }
            double d = lnrVar.a;
            lnr lnrVar2 = lpsVar.b;
            if (lnrVar2 == null) {
                lnrVar2 = lnr.c;
            }
            F().startActivity(fma.bK(d, lnrVar2.b));
            return;
        }
        if (i == 1) {
            iqd iqdVar = new iqd(y());
            iqdVar.n(R.string.accessories_remove_device_confirmation);
            iqdVar.r(R.string.accessories_remove_device, new ece(this, 13));
            iqdVar.p(android.R.string.cancel, new elb(1));
            iqdVar.b().show();
            return;
        }
        throw new UnsupportedOperationException("Unexpected accessory button click");
    }

    @Override // defpackage.ag
    public final void g(Bundle bundle) {
        lql lqlVar;
        lqu lquVar;
        super.g(bundle);
        this.as = L(new eyq(), new pd() { // from class: edh
            @Override // defpackage.pd
            public final void a(Object obj) {
            }
        });
        this.ar = (edv) new ddh((cgq) this).q(edv.class);
        jin jinVar = new jin();
        ecq ecqVar = new ecq(0, T(R.string.navigate_to_device), cu.c(y(), R.drawable.gs_directions_vd_theme_24), jer.h(cu.c(y(), R.drawable.gs_launch_vd_theme_24)));
        this.at = ecqVar;
        jinVar.h(ecqVar);
        if (lua.a.a().R()) {
            edv edvVar = this.ar;
            if (edvVar == null) {
                mpd.b("viewModel");
                edvVar = null;
            }
            lqd lqdVar = edvVar.c;
            if (lqdVar.a == 5) {
                lqlVar = (lql) lqdVar.b;
            } else {
                lqlVar = lql.c;
            }
            if (lqlVar.a == 2) {
                lquVar = (lqu) lqlVar.b;
            } else {
                lquVar = lqu.c;
            }
            kxv kxvVar = lquVar.b;
            if (kxvVar == null) {
                kxvVar = kxv.b;
            }
            String str = kxvVar.a;
            str.getClass();
            if (str.length() > 0) {
                ecq ecqVar2 = new ecq(1, T(R.string.erase_device), cu.c(y(), R.drawable.gs_delete_vd_theme_24), jdl.a);
                this.aC = ecqVar2;
                jinVar.h(ecqVar2);
            }
        }
        jis g = jinVar.g();
        g.getClass();
        this.au = g;
    }
}
