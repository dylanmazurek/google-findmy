package defpackage;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import com.google.android.apps.adm.R;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.libraries.onegoogle.accountmenu.cards.DynamicCardRootView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class euc implements cfo {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ euc(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.cfo
    public final void d(Object obj) {
        boolean add;
        int i;
        int i2 = 8;
        byte[] bArr = null;
        int i3 = 1;
        switch (this.b) {
            case 0:
                jer jerVar = (jer) obj;
                if (!jerVar.g()) {
                    return;
                }
                Object obj2 = this.a;
                ((eud) obj2).b.c((ag) obj2, (evh) jerVar.c(), R.id.continue_button, new eka(obj2, i2));
                return;
            case 1:
                Object obj3 = this.a;
                eue eueVar = (eue) obj;
                eud eudVar = (eud) obj3;
                eudVar.ah.d(null);
                eudVar.ah.setEnabled(eueVar.a);
                int i4 = eueVar.c - 1;
                if (i4 != 0) {
                    if (i4 != 1) {
                        Object c = eueVar.b.c();
                        jer a = eudVar.d.a();
                        if (!a.g()) {
                            ((ag) obj3).H().ad();
                            return;
                        }
                        lqc lqcVar = (lqc) a.c();
                        kyf kyfVar = eudVar.c.a(lqcVar).b;
                        if (kyfVar == null) {
                            kyfVar = kyf.r;
                        }
                        kyl kylVar = kyfVar.c;
                        if (kylVar == null) {
                            kylVar = kyl.j;
                        }
                        kyj b = kyj.b(kylVar.e);
                        if (b == null) {
                            b = kyj.UNRECOGNIZED;
                        }
                        String U = eudVar.U(R.string.device_sharing_template_to_send, eudVar.a.unicodeWrap(lqcVar.g), new StringBuilder().appendCodePoint(((Integer) eku.b.getOrDefault(b, 128205)).intValue()).toString(), eudVar.a.unicodeWrap((String) c));
                        Intent intent = new Intent();
                        intent.setAction("android.intent.action.SEND");
                        intent.putExtra("android.intent.extra.TEXT", U);
                        intent.putExtra("android.intent.extra.SUBJECT", eudVar.U(R.string.device_sharing_subject_template, eudVar.a.unicodeWrap(lqcVar.g)));
                        intent.setType("text/plain");
                        eudVar.as(Intent.createChooser(intent, null));
                        ((ag) obj3).H().ad();
                        return;
                    }
                    eudVar.ah.d(fma.bL(eudVar.F()));
                    return;
                }
                eudVar.ah.setVisibility(0);
                jer a2 = eudVar.d.a();
                if (!a2.g()) {
                    return;
                }
                lqc lqcVar2 = (lqc) a2.c();
                eyf.l(lqcVar2, eudVar.e);
                eudVar.af.setText(eudVar.a.unicodeWrap(lqcVar2.g));
                kyf kyfVar2 = eudVar.c.a(lqcVar2).b;
                if (kyfVar2 == null) {
                    kyfVar2 = kyf.r;
                }
                String str = kyfVar2.h;
                if (TextUtils.isEmpty(str)) {
                    eudVar.ag.setVisibility(8);
                    return;
                } else {
                    eudVar.ag.setVisibility(0);
                    eudVar.ag.setText(eudVar.a.unicodeWrap(str));
                    return;
                }
            case 2:
                etd etdVar = (etd) obj;
                int i5 = etdVar.b - 1;
                Object obj4 = this.a;
                if (i5 != 0) {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            ((euh) obj4).e.h();
                            return;
                        } else {
                            ((ag) obj4).H().ad();
                            return;
                        }
                    }
                    ((euh) obj4).e.g((String) etdVar.a.c());
                    return;
                }
                ((euh) obj4).e.i();
                return;
            case 3:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                Object obj5 = this.a;
                if (booleanValue) {
                    euh euhVar = (euh) obj5;
                    euhVar.af.setEnabled(false);
                    euhVar.af.d(fma.bL(euhVar.F()));
                    return;
                } else {
                    euh euhVar2 = (euh) obj5;
                    euhVar2.af.setEnabled(true);
                    euhVar2.af.d(null);
                    return;
                }
            case 4:
                jer jerVar2 = (jer) obj;
                if (jerVar2.g()) {
                    euh euhVar3 = (euh) this.a;
                    euhVar3.ah.s();
                    euhVar3.ag.e((lqc) jerVar2.c());
                    return;
                }
                return;
            case 5:
                jer jerVar3 = (jer) obj;
                if (!jerVar3.g()) {
                    return;
                }
                Object obj6 = this.a;
                ((euh) obj6).b.c((ag) obj6, (evh) jerVar3.c(), R.id.cancel_button, new eka(obj6, 9));
                return;
            case 6:
                ((cfn) this.a).l((eul) obj);
                return;
            case 7:
                jjr jjrVar = (jjr) obj;
                eur eurVar = (eur) this.a;
                if (eurVar.af == null) {
                    ((jni) ((jni) eur.a.f()).j("com/google/android/apps/adm/map/DeviceMapFragment", "showLocations", 188, "DeviceMapFragment.java")).r("BUG: clusterManager is null and setLocations is called");
                    return;
                }
                eurVar.d();
                jmw listIterator = jjrVar.listIterator();
                while (listIterator.hasNext()) {
                    dya dyaVar = (dya) listIterator.next();
                    if ((dyaVar.b.a & i3) != 0) {
                        lao laoVar = eurVar.af;
                        dhx dhxVar = new dhx(dyaVar);
                        lav lavVar = laoVar.b;
                        lavVar.a();
                        try {
                            laq laqVar = lavVar.a;
                            laq laqVar2 = ((lau) laqVar).a;
                            lar larVar = new lar(dhxVar);
                            synchronized (((las) laqVar2).c) {
                                add = ((las) laqVar2).b.add(larVar);
                                if (add) {
                                    lbp lbpVar = ((las) laqVar2).c;
                                    lbm lbmVar = larVar.a;
                                    lbl lblVar = lbpVar.a;
                                    double d = lbmVar.a;
                                    double d2 = lbmVar.b;
                                    if (lblVar.a(d, d2)) {
                                        lbpVar.b(d, d2, larVar);
                                    }
                                }
                            }
                            if (add) {
                                ((lau) laqVar).d();
                            }
                            lavVar.b();
                            i3 = 1;
                        } catch (Throwable th) {
                            lavVar.b();
                            throw th;
                        }
                    }
                }
                eurVar.af.b();
                return;
            case 8:
                ((eur) this.a).q((ewi) obj);
                return;
            case 9:
                Boolean bool = (Boolean) obj;
                frk frkVar = ((eur) this.a).e;
                if (frkVar != null) {
                    frkVar.d(bool.booleanValue());
                    return;
                }
                return;
            case 10:
                ((eur) this.a).p((CameraPosition) obj);
                return;
            case 11:
                ((hbk) this.a).c();
                return;
            case 12:
                jer jerVar4 = (jer) obj;
                hcv hcvVar = (hcv) this.a;
                DynamicCardRootView dynamicCardRootView = hcvVar.t;
                if (dynamicCardRootView.k && dynamicCardRootView.i.g() && !dynamicCardRootView.j.equals(jerVar4)) {
                    dynamicCardRootView.j = jerVar4;
                    jis f = dynamicCardRootView.f();
                    int i6 = ((jmi) f).c;
                    int i7 = 0;
                    while (true) {
                        hjp hjpVar = hcvVar.s;
                        if (i7 < i6) {
                            ((hjs) f.get(i7)).cU(hjpVar);
                            i7++;
                        } else {
                            dynamicCardRootView.cU(hjpVar);
                            if (jerVar4.g()) {
                                hjpVar.d(dynamicCardRootView, ((Integer) dynamicCardRootView.i.c()).intValue(), (gbm) jerVar4.c());
                            } else {
                                dynamicCardRootView.b(hjpVar);
                            }
                            jis f2 = dynamicCardRootView.f();
                            int i8 = ((jmi) f2).c;
                            for (int i9 = 0; i9 < i8; i9++) {
                                ((hjs) f2.get(i9)).b(hjpVar);
                            }
                            dynamicCardRootView.k = true;
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
            case 13:
                Object obj7 = this.a;
                ((hcv) obj7).t.setOnClickListener(new ecp(obj7, (jer) obj, 18, bArr));
                return;
            case 14:
                ((hcv) this.a).t.setContentDescription((CharSequence) ((jer) obj).f());
                return;
            case 15:
                Boolean bool2 = (Boolean) obj;
                if (true != bool2.booleanValue()) {
                    i = 8;
                } else {
                    i = 0;
                }
                hcv hcvVar2 = (hcv) this.a;
                hcvVar2.u.setVisibility(i);
                if (true != bool2.booleanValue()) {
                    i2 = 0;
                }
                hcvVar2.v.setVisibility(i2);
                return;
            case 16:
                Object obj8 = this.a;
                hcz hczVar = (hcz) obj8;
                hczVar.y.setImageDrawable(((hdp) obj).a(((hcv) obj8).r, hczVar.x));
                return;
            case 17:
                hdn hdnVar = (hdn) this.a;
                hdnVar.G.setTextColor(hdnVar.J((jer) obj));
                return;
            case 18:
                View.OnClickListener onClickListener = (View.OnClickListener) ((jer) obj).f();
                hdn hdnVar2 = (hdn) this.a;
                hdnVar2.P = onClickListener;
                hdnVar2.K(hdnVar2.P, hdnVar2.O);
                return;
            case 19:
                jis jisVar = (jis) obj;
                boolean z = !jisVar.isEmpty();
                hdn hdnVar3 = (hdn) this.a;
                hdnVar3.S = z;
                hdnVar3.A.c.c(jisVar);
                hdnVar3.N(hdnVar3.R);
                return;
            default:
                hdn hdnVar4 = (hdn) this.a;
                hdnVar4.H.setTextColor(hdnVar4.J((jer) obj));
                return;
        }
    }
}
