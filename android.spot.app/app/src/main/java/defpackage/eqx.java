package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.Group;
import com.google.android.apps.adm.R;
import com.google.android.apps.adm.activities.MainActivity;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eqx extends eqs {
    public static final jnk a = jnk.l("com/google/android/apps/adm/integrations/spot/nearby/SpotDeviceNearbyFragment");
    public TextView af;
    public TextView ag;
    public Group ah;
    public TextView ai;
    public ImageView aj;
    public ViewStub ak;
    public View al;
    public esr am;
    public ecz an;
    public ena ao;
    public MainActivity ap;
    public dhx aq;
    private lqd ar;
    private MaterialButton as;
    private MaterialButton at;
    private MaterialToolbar au;
    private eqv av;
    private ekx aw;
    public eqt b;
    public evo c;
    public ele d;
    public kyh e;

    public static boolean o(ekw ekwVar, kyh kyhVar) {
        return ekwVar.b.a(kyhVar).h;
    }

    public static boolean p(int i) {
        if (i == 0) {
            return false;
        }
        int i2 = i - 1;
        if (i2 != 1 && i2 != 2) {
            return false;
        }
        return true;
    }

    private final eis q() {
        ekw ekwVar = (ekw) this.aw.f.d();
        if (ekwVar == null) {
            ((jni) ((jni) a.g()).j("com/google/android/apps/adm/integrations/spot/nearby/SpotDeviceNearbyFragment", "getCurrentProximityState", 450, "SpotDeviceNearbyFragment.java")).r("BUG: Current SpotDeviceUiState is unexpectedly null");
            return eis.NOT_IN_RANGE;
        }
        ekv a2 = ekwVar.a(this.e);
        if (a2 == null) {
            ((jni) ((jni) a.g()).j("com/google/android/apps/adm/integrations/spot/nearby/SpotDeviceNearbyFragment", "getCurrentProximityState", 456, "SpotDeviceNearbyFragment.java")).r("BUG: No component UI state in getCurrentProximityState");
            return eis.NOT_IN_RANGE;
        }
        return a2.b;
    }

    @Override // defpackage.ag
    public final View J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kyk kykVar;
        ezr d;
        lim limVar;
        int i = 0;
        View inflate = layoutInflater.inflate(R.layout.fragment_nearby_device, viewGroup, false);
        this.am = esr.f(this, false);
        ecz eczVar = (ecz) new ddh((cgq) this).q(ecz.class);
        this.an = eczVar;
        eczVar.b();
        MaterialToolbar materialToolbar = (MaterialToolbar) inflate.findViewById(R.id.toolbar);
        this.au = materialToolbar;
        materialToolbar.t("");
        this.af = (TextView) inflate.findViewById(R.id.device_title);
        this.ag = (TextView) inflate.findViewById(R.id.case_info);
        MaterialButton materialButton = (MaterialButton) inflate.findViewById(R.id.ring_button);
        this.as = materialButton;
        materialButton.setOnClickListener(new eph(this, 6));
        this.at = (MaterialButton) inflate.findViewById(R.id.ring_volume_button);
        this.ah = (Group) inflate.findViewById(R.id.device_state_group);
        this.ai = (TextView) inflate.findViewById(R.id.device_battery_status);
        this.aj = (ImageView) inflate.findViewById(R.id.device_battery_icon);
        this.ak = (ViewStub) inflate.findViewById(R.id.recommendation_card);
        ((cfk) this.aq.a).g(this, new epy(this, 11));
        ddh ddhVar = new ddh((cgq) this);
        this.av = (eqv) ddhVar.q(eqv.class);
        ekx ekxVar = (ekx) ddhVar.q(ekx.class);
        this.aw = ekxVar;
        ekxVar.a(this.e);
        ComposeView composeView = (ComposeView) inflate.findViewById(R.id.proximity_ui);
        cfk a2 = this.av.a();
        kyf kyfVar = this.d.a(this.av.e).b;
        if (kyfVar == null) {
            kyfVar = kyf.r;
        }
        kyh kyhVar = this.e;
        jnk jnkVar = eku.a;
        kyl kylVar = kyfVar.c;
        if (kylVar == null) {
            kylVar = kyl.j;
        }
        kyi kyiVar = (kyi) hzc.U(kylVar.f, new etw(kyhVar, 1)).f();
        if (kyiVar == null) {
            ((jni) ((jni) eku.a.g()).j("com/google/android/apps/adm/integrations/spot/SpotDeviceUtil", "getComponentIconGlideImageSource", 108, "SpotDeviceUtil.java")).r("No image for requested component; falling back to device image");
            d = eku.c(kyfVar);
        } else {
            int i2 = kyiVar.a;
            if (i2 != 0) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        i = 2;
                    }
                } else {
                    i = 1;
                }
            } else {
                i = 3;
            }
            if (i != 0) {
                int i3 = i - 1;
                if (i3 != 0) {
                    if (i3 != 1) {
                        ((jni) ((jni) eku.a.g()).j("com/google/android/apps/adm/integrations/spot/SpotDeviceUtil", "getComponentIconGlideImageSource", 117, "SpotDeviceUtil.java")).r("Component doesn't contain an image");
                        d = new ezn();
                    } else {
                        if (i2 == 3) {
                            limVar = (lim) kyiVar.b;
                        } else {
                            limVar = lim.b;
                        }
                        d = new ezo(limVar, 1);
                    }
                } else {
                    if (i2 == 2) {
                        kykVar = (kyk) kyiVar.b;
                    } else {
                        kykVar = kyk.c;
                    }
                    d = eku.d(kykVar);
                }
            } else {
                throw null;
            }
        }
        a2.getClass();
        Object a3 = d.a();
        if (composeView != null) {
            composeView.e();
            composeView.f(new alf(1408897701, true, new xx(a2, a3, 7)));
        }
        ComposeView composeView2 = (ComposeView) inflate.findViewById(R.id.proximity_status_text);
        cfk a4 = this.av.a();
        a4.getClass();
        if (composeView2 != null) {
            composeView2.e();
            composeView2.f(new alf(612822172, true, new yj(a4, 9)));
        }
        return inflate;
    }

    @Override // defpackage.ag
    public final void ad() {
        ((cs) F()).i(null);
        eqv eqvVar = this.av;
        eqvVar.d();
        eqvVar.h = jer.i(eqvVar.c.schedule(new dzw(eqvVar.k, 18), eqv.a.toSeconds(), TimeUnit.SECONDS));
        super.ad();
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, jyz] */
    @Override // defpackage.ag
    public final void af() {
        lpt lptVar;
        super.af();
        ((cs) F()).i(this.au);
        cs csVar = (cs) F();
        csVar.i(this.au);
        ch g = csVar.g();
        g.getClass();
        g.g(true);
        g.s();
        eqv eqvVar = this.av;
        if (eqvVar.h.g()) {
            eqvVar.h.c().cancel(false);
            eqvVar.h = jdl.a;
        }
        if (eqvVar.l.g()) {
            eqvVar.k.c();
            synchronized (eqvVar.i) {
                if (!eqvVar.j.g()) {
                    lqc lqcVar = eqvVar.e;
                    if (lqcVar.b == 3) {
                        lptVar = (lpt) lqcVar.c;
                    } else {
                        lptVar = lpt.C;
                    }
                    lpz lpzVar = lptVar.u;
                    if (lpzVar == null) {
                        lpzVar = lpz.e;
                    }
                    kyf kyfVar = lpzVar.b;
                    if (kyfVar == null) {
                        kyfVar = kyf.r;
                    }
                    if (hqk.d(kyfVar)) {
                        eqvVar.j = jer.i(eqvVar.c.scheduleWithFixedDelay(new dzw(eqvVar, 19), 0L, eqv.b.toSeconds(), TimeUnit.SECONDS));
                    }
                }
            }
        }
    }

    @Override // defpackage.ag
    public final void ag(View view, Bundle bundle) {
        if (lua.l()) {
            MainActivity mainActivity = this.ap;
            bsh bshVar = new bsh();
            jjr o = jjr.o("android.permission.UWB_RANGING", "android.permission.CAMERA");
            int hashCode = bshVar.hashCode();
            Set bA = fma.bA(mainActivity, o);
            if (!bA.isEmpty()) {
                String[] strArr = (String[]) bA.toArray(new String[bA.size()]);
                try {
                    bpa.a(mainActivity, strArr, hashCode);
                } catch (Exception unused) {
                    int[] iArr = new int[strArr.length];
                    Arrays.fill(iArr, 0);
                    mainActivity.onRequestPermissionsResult(hashCode, strArr, iArr);
                }
                mainActivity.r.put(Integer.valueOf(hashCode), bshVar);
            }
        }
        this.am.a().g(O(), new epy(this, 7));
        this.av.a().g(O(), new epy(this, 8));
        this.aw.f.g(O(), new epy(this, 9));
        this.an.a().g(O(), new epy(this, 10));
        O().N().a(this.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(defpackage.eda r10) {
        /*
            r9 = this;
            eis r0 = r9.q()
            eis r1 = defpackage.eis.IN_RANGE
            if (r0 != r1) goto Lb6
            int r0 = r10.g
            ecy r10 = defpackage.bsd.d(r10)
            com.google.android.material.button.MaterialButton r1 = r9.as
            r2 = 0
            r1.setVisibility(r2)
            com.google.android.material.button.MaterialButton r1 = r9.as
            int r3 = r10.a
            r1.setText(r3)
            com.google.android.material.button.MaterialButton r1 = r9.as
            boolean r3 = r10.d
            r4 = 4
            r5 = 1
            if (r3 == 0) goto L38
            eqv r3 = r9.av
            cfk r3 = r3.a()
            java.lang.Object r3 = r3.d()
            equ r3 = (defpackage.equ) r3
            r3.getClass()
            int r3 = r3.d
            if (r3 != r4) goto L38
            r3 = 1
            goto L39
        L38:
            r3 = 0
        L39:
            r1.setEnabled(r3)
            com.google.android.material.button.MaterialButton r1 = r9.as
            int r3 = r10.b
            r1.e(r3)
            boolean r1 = p(r0)
            if (r1 == 0) goto L88
            r3 = 2
            if (r0 != r3) goto L58
            java.lang.String r10 = r10.c
            android.content.Context r0 = r9.y()
            com.google.android.material.button.MaterialButton r3 = r9.as
            defpackage.fma.bQ(r0, r3, r10)
            goto L88
        L58:
            r3 = 3
            if (r0 != r3) goto L88
            jer r0 = r10.e
            boolean r0 = r0.g()
            if (r0 == 0) goto L88
            jer r10 = r10.e
            java.lang.Object r10 = r10.c()
            android.content.Context r0 = r9.y()
            com.google.android.material.button.MaterialButton r3 = r9.as
            android.content.res.Resources r6 = r9.z()
            r7 = r10
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            java.lang.Object[] r8 = new java.lang.Object[r5]
            r8[r2] = r10
            r10 = 2131820545(0x7f110001, float:1.9273808E38)
            java.lang.String r10 = r6.getQuantityString(r10, r7, r8)
            defpackage.fma.bQ(r0, r3, r10)
        L88:
            esr r10 = r9.am
            cfk r10 = r10.a()
            java.lang.Object r10 = r10.d()
            eso r10 = (defpackage.eso) r10
            r10.getClass()
            r9.e(r10)
            if (r1 != 0) goto Lb0
            eqv r10 = r9.av
            cfk r10 = r10.a()
            java.lang.Object r10 = r10.d()
            equ r10 = (defpackage.equ) r10
            r10.getClass()
            int r10 = r10.d
            if (r10 != r4) goto Lb0
            r2 = 1
        Lb0:
            com.google.android.material.button.MaterialButton r10 = r9.at
            r10.setEnabled(r2)
            return
        Lb6:
            com.google.android.material.button.MaterialButton r10 = r9.as
            r0 = 8
            r10.setVisibility(r0)
            com.google.android.material.button.MaterialButton r10 = r9.at
            r10.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eqx.d(eda):void");
    }

    public final void e(eso esoVar) {
        if (esoVar.a && q() == eis.IN_RANGE) {
            if (this.at.getVisibility() != 0) {
                this.at.setVisibility(0);
            }
            this.at.setOnClickListener(new eph(this, 5));
            return;
        }
        this.at.setVisibility(8);
    }

    @Override // defpackage.eqs, defpackage.ag
    public final void f(Context context) {
        super.f(context);
        F().c().b(this, new eqw(this));
    }

    @Override // defpackage.ag
    public final void g(Bundle bundle) {
        super.g(bundle);
        this.ar = eyf.g(A());
        Bundle A = A();
        jnk jnkVar = eku.a;
        this.e = (kyh) jer.h(kyh.b(A.getInt("spot_device_utils_device_component", -1))).e(kyh.DEVICE_COMPONENT_UNSPECIFIED);
        this.ao.g(this.ad, this.ar);
    }
}
