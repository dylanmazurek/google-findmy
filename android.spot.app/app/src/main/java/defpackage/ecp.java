package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.google.android.apps.adm.R;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ecp implements View.OnClickListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public ecp(Context context, Intent intent, int i) {
        this.c = i;
        this.b = context;
        this.a = intent;
    }

    /* JADX WARN: Type inference failed for: r0v61, types: [android.view.View$OnClickListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v73, types: [android.view.View$OnClickListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v23, types: [hix, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, hbg] */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Object, haw] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, haw] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, hjp] */
    /* JADX WARN: Type inference failed for: r7v43, types: [hix, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 0;
        int i2 = 1;
        switch (this.c) {
            case 0:
                ((ecr) this.a).d(((ecq) this.b).a);
                return;
            case 1:
                dzg dzgVar = (dzg) this.a;
                dzgVar.b.setTransitionName("transition_name:device_picker_selected_item");
                dzgVar.b.findViewById(R.id.icon).setTransitionName("transition_name:device_picker_item_icon");
                dzgVar.s.l(dxq.SELECT_DEVICE);
                dzgVar.r.e(((dzf) this.b).a.a);
                return;
            case 2:
                ((ekh) this.b).ap.a((kyh) this.a);
                return;
            case 3:
                Bundle bundle = new Bundle();
                bundle.putString("owner_email", (String) this.a);
                enz enzVar = (enz) this.b;
                enzVar.H().P("OWNER_DETAILS_BOTTOM_SHEET_DIALOG_FRAGMENT_RESULT", bundle);
                enzVar.d();
                return;
            case 4:
                eoa eoaVar = (eoa) this.b;
                if (eoaVar.a.af.g()) {
                    Object obj = this.a;
                    Object c = eoaVar.a.af.c();
                    njz njzVar = (njz) c;
                    ((ekc) njzVar.a).d = true;
                    ((ekc) njzVar.a).e(new eka(((eoe) obj).a, i), new dzw(c, 6), R.string.spot_device_details_update_category_failed);
                }
                eoaVar.a.d();
                return;
            case 5:
                ((eoj) this.a).af.h(((Bundle) this.b).getString("shared_owner_email", ""));
                return;
            case 6:
                ((eoi) this.b).f.accept(this.a);
                return;
            case 7:
                Object obj2 = this.b;
                eok eokVar = (eok) obj2;
                iqd iqdVar = new iqd(eokVar.y());
                iqdVar.s(R.string.spot_device_details_relinquish_device_dialog_title);
                iqdVar.o(eokVar.U(R.string.spot_device_details_relinquish_device_dialog_content, eokVar.c.unicodeWrap(((eoo) this.a).a)));
                iqdVar.r(R.string.spot_device_details_relinquish_device_confirmation_button, new ece(obj2, 18));
                iqdVar.p(android.R.string.cancel, new elb(2));
                iqdVar.b().show();
                return;
            case 8:
                eqr.aG(eqq.PHONE_NUMBER, ((kxz) this.a).a, 0).q(((eqa) this.b).G(), null);
                return;
            case 9:
                eqr.aG(eqq.OWNER_MESSAGE, ((kxz) this.a).b, (int) lua.a.a().e()).q(((eqa) this.b).G(), null);
                return;
            case 10:
                eqf eqfVar = (eqf) this.b;
                eqfVar.p((kxz) eqfVar.b.c.e(this.a), true);
                return;
            case 11:
                evo.f((Activity) this.b, (Intent) this.a);
                return;
            case 12:
                evo.g((Activity) this.b, (Intent) this.a);
                return;
            case 13:
                ewv ewvVar = (ewv) this.b;
                kyh kyhVar = (kyh) ewvVar.h.d();
                kyhVar.getClass();
                Bundle bundle2 = new Bundle();
                eyf.m((lqd) this.a, bundle2);
                eku.h(kyhVar, bundle2);
                eqx eqxVar = new eqx();
                eqxVar.ak(bundle2);
                ebb a = ebc.a();
                a.a = "NEARBY_FRAGMENT_FRAGMENT";
                a.b(true);
                ewvVar.i.k(eqxVar, a.a());
                return;
            case 14:
                try {
                    ((Context) this.b).startActivity((Intent) this.a);
                    return;
                } catch (ActivityNotFoundException e) {
                    Log.e("DeferredLifecycleHelper", "Failed to start resolution intent", e);
                    return;
                }
            case 15:
                kqr kqrVar = (kqr) this.b;
                kqrVar.b.a(kqrVar.c.a(), (lnh) kqrVar.f);
                kqrVar.e.f(new bym(5), view);
                kqrVar.a.a(this.a);
                kqrVar.b.a(kqrVar.c.a(), (lnh) kqrVar.d);
                return;
            case 16:
                SelectedAccountDisc selectedAccountDisc = (SelectedAccountDisc) this.a;
                hcc hccVar = selectedAccountDisc.e;
                if (hccVar != null) {
                    hccVar.l.f(new bym(5), view);
                }
                hac hacVar = selectedAccountDisc.f;
                if (hacVar != null) {
                    jis jisVar = hacVar.a;
                    int i3 = ((jmi) jisVar).c;
                    while (i < i3) {
                        i++;
                    }
                }
                ?? r0 = this.b;
                if (r0 != 0) {
                    r0.onClick(view);
                    return;
                }
                return;
            case 17:
                hcl hclVar = (hcl) this.a;
                Runnable runnable = hclVar.c;
                if (runnable != null) {
                    runnable.run();
                }
                Object obj3 = this.b;
                if (((Boolean) hclVar.d.a()).booleanValue()) {
                    ijs.c();
                    hci hciVar = (hci) obj3;
                    hmh a2 = hciVar.a();
                    a2.aI(new hfu(a2, i2));
                    hciVar.b(a2);
                    return;
                }
                ijs.c();
                hci hciVar2 = (hci) obj3;
                hciVar2.b(hciVar2.a());
                return;
            case 18:
                bym bymVar = new bym(5);
                hcv hcvVar = (hcv) this.b;
                hcvVar.s.f(bymVar, hcvVar.t);
                jer jerVar = (jer) this.a;
                if (jerVar.g()) {
                    ((View.OnClickListener) jerVar.c()).onClick(view);
                    return;
                }
                return;
            case 19:
                bym bymVar2 = new bym(5);
                Object obj4 = this.a;
                ((hcv) obj4).s.f(bymVar2, ((hdn) obj4).G);
                this.b.onClick(view);
                return;
            default:
                bym bymVar3 = new bym(5);
                Object obj5 = this.b;
                ((hcv) obj5).s.f(bymVar3, ((hdn) obj5).H);
                ((View.OnClickListener) ((jer) this.a).c()).onClick(view);
                return;
        }
    }

    public /* synthetic */ ecp(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ ecp(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
