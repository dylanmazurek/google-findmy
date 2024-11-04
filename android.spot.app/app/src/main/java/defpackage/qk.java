package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.apps.adm.R;
import com.google.android.apps.adm.activities.MainActivity;
import j$.util.Map;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class qk implements cfo {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ qk(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r7v6, types: [kqz, java.lang.Object] */
    @Override // defpackage.cfo
    public final void d(Object obj) {
        boolean z;
        List c;
        int i = 13;
        Object obj2 = null;
        int i2 = 0;
        int i3 = 1;
        switch (this.b) {
            case 0:
                kvw kvwVar = (kvw) obj;
                if (kvwVar != null) {
                    qr qrVar = (qr) this.a;
                    qrVar.aI(kvwVar);
                    qrVar.a.p(null);
                    return;
                }
                return;
            case 1:
                if (((Boolean) obj).booleanValue()) {
                    qr qrVar2 = (qr) this.a;
                    qrVar2.a(1);
                    qrVar2.d();
                    qrVar2.a.g(false);
                    return;
                }
                return;
            case 2:
                qj qjVar = (qj) obj;
                if (qjVar != null) {
                    int i4 = qjVar.a;
                    switch (i4) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                            z = true;
                            break;
                        case 6:
                        default:
                            z = false;
                            break;
                    }
                    Object obj3 = this.a;
                    if (true != z) {
                        i4 = 8;
                    }
                    ag agVar = (ag) obj3;
                    Context x = agVar.x();
                    if (Build.VERSION.SDK_INT < 29) {
                        if (i4 != 7) {
                            if (i4 == 9) {
                                i4 = 9;
                            }
                        }
                        if (x != null && kv.d(x)) {
                            qr qrVar3 = (qr) obj3;
                            if (ja.b(qrVar3.a.a())) {
                                qrVar3.e();
                                ((qr) obj3).a.e(null);
                                return;
                            }
                        }
                    }
                    int i5 = i4;
                    CharSequence charSequence = qjVar.b;
                    qr qrVar4 = (qr) obj3;
                    if (qrVar4.aG()) {
                        if (charSequence == null) {
                            charSequence = ku.b(agVar.x(), i5);
                        }
                        CharSequence charSequence2 = charSequence;
                        if (i5 == 5) {
                            int i6 = qrVar4.a.e;
                            if (i6 == 0 || i6 == 3) {
                                qrVar4.aH();
                            }
                            qrVar4.d();
                        } else {
                            if (qrVar4.a.r) {
                                qrVar4.o(i5, charSequence2);
                            } else {
                                qrVar4.p(charSequence2);
                                Handler handler = qrVar4.b;
                                oa oaVar = new oa(obj3, i5, charSequence2, 3, (byte[]) null);
                                Context x2 = agVar.x();
                                if (x2 == null || !kk.e(x2, Build.MODEL)) {
                                    i2 = 2000;
                                }
                                handler.postDelayed(oaVar, i2);
                            }
                            qrVar4.a.r = true;
                        }
                    } else {
                        if (charSequence == null) {
                            charSequence = agVar.T(R.string.default_error_msg) + " " + i5;
                        }
                        qrVar4.o(i5, charSequence);
                    }
                    ((qr) obj3).a.e(null);
                    return;
                }
                return;
            case 3:
                CharSequence charSequence3 = (CharSequence) obj;
                if (charSequence3 != null) {
                    qr qrVar5 = (qr) this.a;
                    if (qrVar5.aG()) {
                        qrVar5.p(charSequence3);
                    }
                    qrVar5.a.e(null);
                    return;
                }
                return;
            case 4:
                if (((Boolean) obj).booleanValue()) {
                    Object obj4 = this.a;
                    qr qrVar6 = (qr) obj4;
                    if (qrVar6.aG()) {
                        qrVar6.p(((ag) obj4).T(R.string.fingerprint_not_recognized));
                    }
                    if (!qrVar6.a.g) {
                        Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                    } else {
                        new nna(1).execute(new nl(obj4, 7));
                    }
                    qrVar6.a.f(false);
                    return;
                }
                return;
            case 5:
                if (((Boolean) obj).booleanValue()) {
                    Object obj5 = this.a;
                    qr qrVar7 = (qr) obj5;
                    if (qrVar7.aF()) {
                        qrVar7.e();
                    } else {
                        CharSequence b = qrVar7.a.b();
                        if (b == null) {
                            b = ((ag) obj5).T(R.string.default_error_msg);
                        }
                        qrVar7.o(13, b);
                        qrVar7.a(2);
                    }
                    qrVar7.a.k(false);
                    return;
                }
                return;
            case 6:
                if (((Boolean) obj).booleanValue()) {
                    qr qrVar8 = (qr) this.a;
                    qrVar8.o(16, "More options button in the content view is clicked.");
                    qrVar8.a(4);
                    qrVar8.a.j(false);
                    return;
                }
                return;
            case 7:
                ((mvz) this.a).j(obj);
                return;
            case 8:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                MainActivity mainActivity = (MainActivity) this.a;
                mainActivity.q = booleanValue;
                if (booleanValue && mainActivity.a().f("MAIN_ACTIVITY_DELEGATE_FRAGMENT") == null) {
                    dvg dvgVar = new dvg();
                    f fVar = new f(mainActivity.a());
                    fVar.t(R.id.activity_main_fragment_container, dvgVar, "MAIN_ACTIVITY_DELEGATE_FRAGMENT");
                    fVar.m(dvgVar);
                    fVar.h();
                    return;
                }
                return;
            case 9:
                jer jerVar = (jer) obj;
                if (jerVar.g()) {
                    dvg dvgVar2 = (dvg) this.a;
                    dvgVar2.d.a.l(jdl.a);
                    String action = ((Intent) jerVar.c()).getAction();
                    Uri data = ((Intent) jerVar.c()).getData();
                    if ("android.intent.action.VIEW".equals(action) && data != null && dvgVar2.b != null) {
                        String queryParameter = data.getQueryParameter("device");
                        if (!TextUtils.isEmpty(queryParameter)) {
                            jvt k = bsc.k(data);
                            mlk mlkVar = new mlk(low.d);
                            while (true) {
                                if (mlkVar.hasNext()) {
                                    Object next = mlkVar.next();
                                    if (((low) next).b(k)) {
                                        obj2 = next;
                                    }
                                }
                            }
                            low lowVar = (low) obj2;
                            if (lowVar != null) {
                                c = lowVar.a(k);
                            } else {
                                c = k.c();
                            }
                            if (c.isEmpty()) {
                                dvgVar2.b.q(jer.i(queryParameter));
                                return;
                            }
                        }
                        dyw dywVar = dvgVar2.e;
                        synchronized (dywVar.d) {
                            dywVar.i = 1;
                            dywVar.e = jdl.a;
                            dywVar.f.cancel(false);
                            dywVar.g.cancel(false);
                            if (moz.v(data.getHost(), "findmydevice.app.google")) {
                                kpb kpbVar = dywVar.b;
                                dywVar.f = fzo.b(((fhq) kpbVar.a).h(new kpj(kpbVar.b, data.toString())));
                                iuu.q(dywVar.f, new dup(dywVar, 4), dywVar.c);
                            } else {
                                dywVar.b(data);
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            case 10:
                dzb dzbVar = (dzb) this.a;
                jer d = dzbVar.d.h(eyf.g(dzbVar.A())).d((eul) obj);
                if (d.g()) {
                    dzbVar.a.m((ag) d.c());
                    return;
                } else {
                    dzbVar.a.l();
                    return;
                }
            case 11:
                dzu dzuVar = (dzu) obj;
                boolean z2 = dzuVar.b;
                dzo dzoVar = (dzo) this.a;
                dzoVar.af.i(z2);
                cmh.b(dzoVar.e, new clu());
                boh bohVar = new boh();
                bohVar.d(dzoVar.a);
                if (dzuVar.a) {
                    bohVar.l(R.id.loading_skeleton, 0);
                } else if (dzuVar.c) {
                    bohVar.l(R.id.device_picker_failure, 0);
                } else {
                    bohVar.l(R.id.device_lists_pager, 0);
                    boolean isEmpty = dzuVar.e.isEmpty();
                    boolean z3 = !isEmpty;
                    Integer num = dzoVar.ah.d;
                    cop copVar = dzoVar.ao;
                    boolean z4 = copVar.j;
                    if (z4 != z3) {
                        copVar.j = z3;
                        if (z4) {
                            copVar.b.d(1, 1);
                        } else {
                            copVar.b.c(1, 1);
                        }
                    }
                    if (!isEmpty) {
                        bohVar.l(R.id.device_lists_tab, 0);
                        if (num != null) {
                            int intValue = num.intValue();
                            ViewPager2 viewPager2 = dzoVar.ag;
                            if (intValue != viewPager2.b) {
                                viewPager2.e(num.intValue(), false);
                            }
                        }
                    }
                }
                bohVar.b(dzoVar.e);
                return;
            case 12:
                jer jerVar2 = (jer) obj;
                if (jerVar2.g()) {
                    Object obj6 = this.a;
                    ((dzo) obj6).c.a((ag) obj6, (evh) jerVar2.c());
                    return;
                }
                return;
            case 13:
                dzo dzoVar2 = (dzo) this.a;
                dzoVar2.d.b(dzoVar2.ai, (ewo) obj);
                return;
            case 14:
                jer jerVar3 = (jer) obj;
                if (jerVar3.g()) {
                    Object obj7 = this.a;
                    ((ecl) obj7).d.b((ag) obj7, (evh) jerVar3.c(), R.id.btn_set_password);
                    return;
                }
                return;
            case 15:
                jer jerVar4 = (jer) obj;
                boolean g = jerVar4.g();
                Object obj8 = this.a;
                if (!g) {
                    ecl eclVar = (ecl) obj8;
                    eclVar.a.k(null);
                    eclVar.b.k(null);
                    return;
                }
                int i7 = ((ezc) jerVar4.c()).b;
                if (i7 != 0) {
                    int i8 = i7 - 1;
                    if (i8 != 0) {
                        if (i8 != 1) {
                            return;
                        }
                        ecl eclVar2 = (ecl) obj8;
                        eclVar2.a.k(null);
                        eclVar2.b.k(((ezc) jerVar4.c()).a);
                        eclVar2.e(eclVar2.b);
                        return;
                    }
                    ecl eclVar3 = (ecl) obj8;
                    eclVar3.a.k(((ezc) jerVar4.c()).a);
                    eclVar3.b.k(null);
                    eclVar3.e(eclVar3.a);
                    return;
                }
                throw null;
            case 16:
                jer jerVar5 = (jer) obj;
                if (jerVar5.g()) {
                    ((ecw) this.a).o((evh) jerVar5.c());
                    return;
                }
                return;
            case 17:
                ((ecw) this.a).p((eda) obj);
                return;
            case 18:
                efh efhVar = (efh) this.a;
                efhVar.ax.b(efhVar.cv(), (ewo) obj);
                return;
            case 19:
                efh efhVar2 = (efh) this.a;
                jer b2 = efhVar2.at.b(new dvh(i));
                efp a = efhVar2.au.a(efhVar2.as);
                if (b2.g() && a != null) {
                    efhVar2.a((lqc) b2.c(), a, 2);
                    return;
                }
                return;
            default:
                jiu jiuVar = new jiu();
                jiuVar.f(efh.an);
                jiuVar.f((Map) obj);
                jiy a2 = jiuVar.a();
                Object obj9 = this.a;
                Map.EL.forEach(a2, new ekg((ecr) obj9, i3));
                efh efhVar3 = (efh) obj9;
                efhVar3.e(efhVar3.ao);
                return;
        }
    }
}
