package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.adm.R;
import com.google.frameworks.client.data.android.debug.HostnameOverrideActivity;
import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ekh extends eip {
    private lqd aB;
    private jer aC = jdl.a;
    jis an;
    public jis ao;
    public ekx ap;
    public evo aq;
    public ewq ar;
    public ele as;
    public ekr at;
    public dyr au;
    public exa av;
    public ena aw;
    public elo ax;
    public dhx ay;
    private static final jnk az = jnk.l("com/google/android/apps/adm/integrations/spot/SpotDevicePanelFragment");
    public static final jiy am = (jiy) DesugarArrays.stream(ejy.values()).collect(jgr.a(Function$CC.identity(), new eff(9)));
    private static final jiy aA = jiy.l(kyh.DEVICE_COMPONENT_RIGHT, Integer.valueOf(R.id.right_component_card), kyh.DEVICE_COMPONENT_LEFT, Integer.valueOf(R.id.left_component_card), kyh.DEVICE_COMPONENT_CASE, Integer.valueOf(R.id.case_component_card));

    @Override // defpackage.ecr, defpackage.ag
    public final View J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View J = super.J(layoutInflater, viewGroup, bundle);
        this.aj.setVisibility(0);
        this.aj.setOnClickListener(new efe(this, 13));
        this.ak.setOnClickListener(new efe(this, 14));
        return J;
    }

    public final void aJ(ejy ejyVar) {
        ekr ekrVar = this.at;
        lqd lqdVar = this.aB;
        ekw ekwVar = (ekw) this.ap.f.d();
        ekwVar.getClass();
        ejyVar.getClass();
        lqdVar.getClass();
        jni jniVar = (jni) ekr.a.e().j("com/google/android/apps/adm/integrations/spot/SpotDeviceUiActionHelper", "onActionRequested", 50, "SpotDeviceUiActionHelper.kt");
        kyh kyhVar = ekwVar.c;
        jniVar.y("[FMD] Action requested: %s (%s)", ejyVar, kyhVar);
        if (ekrVar.c.a() == null) {
            ((jni) ekr.a.g().j("com/google/android/apps/adm/integrations/spot/SpotDeviceUiActionHelper", "onActionRequested", 52, "SpotDeviceUiActionHelper.kt")).r("BUG: Current device is unexpectedly null");
            return;
        }
        switch (ejyVar.ordinal()) {
            case 0:
                ekrVar.b.a(lqdVar, lpk.SPOT_LOCATE);
                return;
            case 1:
                ekrVar.e.i(lqdVar);
                ekrVar.f.l(dxq.DEVICE_INFO);
                return;
            case 2:
                ekrVar.d.a(lqdVar, kyhVar, ekrVar.e);
                return;
            case 3:
                ((jni) ekr.a.f().j("com/google/android/apps/adm/integrations/spot/SpotDeviceUiActionHelper", "onActionRequested", 64, "SpotDeviceUiActionHelper.kt")).r("Unexpected STOP_SOUND action");
                return;
            case 4:
            case 5:
                ebf ebfVar = ekrVar.e;
                eqf d = eqf.d(lqdVar);
                ebb a = ebc.a();
                a.a = "MarkAsLostFragment_transaction_tag";
                a.b(true);
                ebfVar.k(d, a.a());
                return;
            case 6:
                ebf ebfVar2 = ekrVar.e;
                eud d2 = eud.d(lqdVar);
                ebb a2 = ebc.a();
                a2.b(true);
                ebfVar2.k(d2, a2.a());
                return;
            case 7:
                ekrVar.a(lqdVar, kyhVar);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x011a, code lost:            if (r14 != 2) goto L48;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void aK(defpackage.ekw r18) {
        /*
            Method dump skipped, instructions count: 634
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ekh.aK(ekw):void");
    }

    @Override // defpackage.ag
    public final void aa(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.spot, menu);
        menu.findItem(R.id.action_change_spot_server).setVisible(fma.bI(x()));
    }

    @Override // defpackage.ag
    public final void ag(View view, Bundle bundle) {
        this.av.h(2).g(O(), new egv(this, 8));
        this.ap.c.g(O(), new egv(this, 9));
        this.ap.f.g(O(), new egv(this, 10));
        this.ap.g.g(O(), new egv(this, 11));
    }

    @Override // defpackage.ag
    public final boolean ay(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.action_change_spot_server) {
            return false;
        }
        try {
            Context x = x();
            List asList = Arrays.asList(lal.s);
            hwx.J(!asList.isEmpty());
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(asList.size());
            Iterator it = asList.iterator();
            while (it.hasNext()) {
                arrayList.add(new kus((ktp) it.next()));
            }
            Intent intent = new Intent(x, (Class<?>) HostnameOverrideActivity.class);
            intent.putParcelableArrayListExtra("to_display", arrayList);
            as(intent);
        } catch (ActivityNotFoundException e) {
            ((jni) ((jni) ((jni) az.f()).i(e)).j("com/google/android/apps/adm/integrations/spot/SpotDevicePanelFragment", "onOptionsItemSelected", (char) 231, "SpotDevicePanelFragment.java")).r("Failed to start hostname override activity");
        }
        return true;
    }

    @Override // defpackage.ecr
    public final void d(int i) {
        boolean z = false;
        if (i >= 0 && i < ejy.values().length) {
            z = true;
        }
        hwx.J(z);
        aJ(ejy.values()[i]);
    }

    @Override // defpackage.ag
    public final void g(Bundle bundle) {
        super.g(bundle);
        this.aB = eyf.g(A());
        this.ap = (ekx) new ddh((cgq) this).q(ekx.class);
        ejy ejyVar = ejy.c;
        String T = T(R.string.ring);
        Drawable a = bqq.a(x(), R.drawable.gs_sound_sensing_vd_theme_24);
        a.getClass();
        eld eldVar = new eld(ejyVar, T, a);
        ejy ejyVar2 = ejy.e;
        String T2 = T(R.string.mark_as_lost);
        Drawable a2 = bqq.a(x(), R.drawable.gs_radar_vd_theme_24);
        a2.getClass();
        eld eldVar2 = new eld(ejyVar2, T2, a2);
        ejy ejyVar3 = ejy.f;
        String T3 = T(R.string.spot_unmark_lost);
        Drawable a3 = bqq.a(x(), R.drawable.gs_lock_open_vd_theme_24);
        a3.getClass();
        eld eldVar3 = new eld(ejyVar3, T3, a3);
        ejy ejyVar4 = ejy.g;
        String T4 = T(R.string.spot_share_device_panel_button_text);
        Drawable a4 = bqq.a(x(), R.drawable.gs_person_add_vd_theme_24);
        a4.getClass();
        eld eldVar4 = new eld(ejyVar4, T4, a4);
        ejy ejyVar5 = ejy.h;
        String T5 = T(R.string.navigate_to_device);
        Drawable a5 = bqq.a(x(), R.drawable.gs_directions_vd_theme_24);
        a5.getClass();
        Drawable a6 = bqq.a(x(), R.drawable.gs_launch_vd_theme_24);
        a6.getClass();
        this.an = jis.t(eldVar, eldVar2, eldVar3, eldVar4, new eld(ejyVar5, T5, a5, jer.i(a6)));
        jin jinVar = new jin();
        jis jisVar = this.an;
        int i = ((jmi) jisVar).c;
        for (int i2 = 0; i2 < i; i2++) {
            eld eldVar5 = (eld) jisVar.get(i2);
            int ordinal = ((ejy) eldVar5.a).ordinal();
            Object obj = eldVar5.d;
            String str = (String) obj;
            jinVar.h(new ecq(ordinal, str, (Drawable) eldVar5.b, (jer) eldVar5.c));
        }
        this.ao = jinVar.g();
        aD();
        this.aw.g(this.ad, this.aB);
        ((cfk) this.ay.a).g(this, new egv(this, 7));
    }

    @Override // defpackage.ag
    public final void h() {
        super.h();
        this.aC = jdl.a;
    }
}
