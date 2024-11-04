package defpackage;

import android.content.res.ColorStateList;
import android.support.v7.widget.RecyclerView;
import android.text.BidiFormatter;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.google.android.apps.adm.R;
import com.google.android.apps.adm.view.DeviceDetailsFieldView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import j$.time.Duration;
import j$.util.Map;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class egv implements cfo {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ egv(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.cfo
    public final void d(Object obj) {
        int i;
        byte[] bArr = null;
        int i2 = 4;
        int i3 = 8;
        boolean z = true;
        int i4 = 0;
        switch (this.b) {
            case 0:
                egw egwVar = (egw) this.a;
                egwVar.c.setText(egwVar.U(R.string.factory_reset_action_caption, BidiFormatter.getInstance().unicodeWrap(((ehx) obj).a())));
                return;
            case 1:
                jer jerVar = (jer) obj;
                if (!jerVar.g()) {
                    return;
                }
                ((efh) this.a).aI((evh) jerVar.c());
                return;
            case 2:
                jer jerVar2 = (jer) obj;
                if (jerVar2.g()) {
                    Object obj2 = this.a;
                    ((egx) obj2).d.b((ag) obj2, (evh) jerVar2.c(), R.id.reset_button);
                    return;
                }
                return;
            case 3:
                jer jerVar3 = (jer) obj;
                if (jerVar3.g()) {
                    Object obj3 = this.a;
                    ((ehg) obj3).d.b((ag) obj3, (evh) jerVar3.c(), R.id.buttons_barrier);
                    return;
                }
                return;
            case 4:
                jer jerVar4 = (jer) obj;
                if (jerVar4.g()) {
                    Object obj4 = this.a;
                    ((ehl) obj4).c.b((ag) obj4, (evh) jerVar4.c(), R.id.secure_device_button);
                    return;
                }
                return;
            case 5:
                jer jerVar5 = (jer) obj;
                if (!jerVar5.g()) {
                    return;
                }
                Object obj5 = this.a;
                ((ehy) obj5).d.a((ag) obj5, (evh) jerVar5.c());
                return;
            case 6:
                ehx ehxVar = (ehx) obj;
                lqc lqcVar = ehxVar.a;
                Object obj6 = this.a;
                ehy ehyVar = (ehy) obj6;
                eyf.l(lqcVar, ehyVar.ag);
                ehyVar.ah.setText(ehyVar.a.unicodeWrap(ehxVar.a()));
                if (TextUtils.isEmpty(ehxVar.d)) {
                    ehyVar.ai.setVisibility(8);
                } else {
                    ehyVar.ai.setVisibility(0);
                    ehyVar.ai.setText(ehyVar.a.unicodeWrap(ehxVar.d));
                }
                if (((Boolean) ehxVar.e.b(new eil(1)).e(false)).booleanValue()) {
                    ehyVar.aj.setText(ehyVar.a.unicodeWrap(ehyVar.U(R.string.imei_info, ehxVar.e.c())));
                    ehyVar.aj.setVisibility(0);
                }
                if (((Long) ehxVar.f.e(0L)).longValue() > 0) {
                    ehyVar.ak.setText(ehyVar.U(R.string.activated_time, fma.bN(((Long) ehxVar.f.c()).longValue())));
                    ehyVar.ak.setVisibility(0);
                }
                DeviceDetailsFieldView deviceDetailsFieldView = ehyVar.al;
                deviceDetailsFieldView.k.setText(deviceDetailsFieldView.i.unicodeWrap(ehxVar.a()));
                deviceDetailsFieldView.k.setVisibility(0);
                ehyVar.al.f(ehxVar.c);
                if (ehxVar.b) {
                    ehyVar.al.setOnClickListener(new efe(obj6, 12));
                    return;
                } else {
                    ehyVar.al.e(false);
                    return;
                }
            case 7:
                jer jerVar6 = (jer) obj;
                if (!jerVar6.g()) {
                    return;
                }
                ekh ekhVar = (ekh) this.a;
                ekhVar.aq.e(ekhVar.F(), (evh) jerVar6.c());
                return;
            case 8:
                ekh ekhVar2 = (ekh) this.a;
                ekhVar2.ar.b(ekhVar2.cv(), (ewo) obj);
                return;
            case 9:
                jiu jiuVar = new jiu();
                jiuVar.f(ekh.am);
                jiuVar.f((Map) obj);
                jiy a = jiuVar.a();
                Object obj7 = this.a;
                Map.EL.forEach(a, new ekg((ecr) obj7, i4));
                ekh ekhVar3 = (ekh) obj7;
                ekhVar3.e(ekhVar3.ao);
                return;
            case 10:
                ((ekh) this.a).aK((ekw) obj);
                return;
            case 11:
                if (((eki) obj).ordinal() != 1) {
                    return;
                }
                ekh ekhVar4 = (ekh) this.a;
                evo evoVar = ekhVar4.aq;
                aj F = ekhVar4.F();
                exu a2 = evj.a();
                a2.b = fma.bV(lua.a.a().K());
                a2.g(Duration.ofSeconds(20L));
                evoVar.e(F, new evh(R.string.spot_new_shared_owner_without_location_snackbar, a2.e()));
                return;
            case 12:
                ((emk) this.a).e();
                return;
            case 13:
                Object obj8 = this.a;
                synchronized (((emz) obj8).h) {
                    if (!((emz) obj8).g) {
                        return;
                    }
                    if (!((emz) obj8).j.g()) {
                        ((emz) obj8).b();
                        return;
                    }
                    if (!((emz) obj8).e.g() && !((emz) obj8).f.g()) {
                        ((emz) obj8).a();
                        return;
                    }
                    return;
                }
            case 14:
                ((eod) this.a).l((ejn) obj);
                return;
            case 15:
                jer jerVar7 = (jer) obj;
                if (!jerVar7.g()) {
                    return;
                }
                Object obj9 = this.a;
                ((eoj) obj9).c.d((ag) obj9, (evh) jerVar7.c(), jdl.a, new eka(obj9, i2));
                return;
            case 16:
                eso esoVar = (eso) obj;
                boolean z2 = esoVar.a;
                Object obj10 = this.a;
                if (!z2) {
                    ((eoj) obj10).ao.setVisibility(8);
                    return;
                }
                eoj eojVar = (eoj) obj10;
                eojVar.ao.g(esoVar.d);
                eojVar.ao.f(esoVar.b);
                return;
            case 17:
                eoo eooVar = (eoo) obj;
                kye kyeVar = eooVar.b;
                eoj eojVar2 = (eoj) this.a;
                eoi eoiVar = eojVar2.aj;
                eoiVar.g = kyeVar;
                eoiVar.c(eooVar.d);
                if (eooVar.e.isEmpty()) {
                    eojVar2.ap.setVisibility(8);
                } else {
                    Group group = eojVar2.ap;
                    if (true != eooVar.f) {
                        i = 0;
                    } else {
                        i = 4;
                    }
                    group.setVisibility(i);
                    eoi eoiVar2 = eojVar2.ak;
                    eoiVar2.g = eooVar.b;
                    eoiVar2.c(eooVar.e);
                }
                int ordinal = eooVar.b.ordinal();
                if (ordinal != 0 && ordinal != 1) {
                    eojVar2.aq.setVisibility(8);
                } else {
                    eojVar2.aq.setVisibility(0);
                }
                boolean z3 = eooVar.f;
                eojVar2.ah.setEnabled(!z3);
                RecyclerView recyclerView = eojVar2.ai;
                if (true != z3) {
                    i2 = 0;
                }
                recyclerView.setVisibility(i2);
                CircularProgressIndicator circularProgressIndicator = eojVar2.al;
                if (true == z3) {
                    i3 = 0;
                }
                circularProgressIndicator.setVisibility(i3);
                TextView textView = eojVar2.am;
                if (!eooVar.c || z3) {
                    z = false;
                }
                textView.setEnabled(z);
                TextView textView2 = eojVar2.am;
                brh.e(textView2, ColorStateList.valueOf(textView2.getCurrentTextColor()));
                return;
            case 18:
                eoo eooVar2 = (eoo) obj;
                kye kyeVar2 = eooVar2.b;
                Object obj11 = this.a;
                if (kyeVar2 != kye.SHARED_WITH_ME) {
                    ((eok) obj11).b.setVisibility(8);
                    return;
                }
                eok eokVar = (eok) obj11;
                eokVar.b.setOnClickListener(new ecp(obj11, eooVar2, 7, bArr));
                eokVar.b.setVisibility(0);
                if (eooVar2.g) {
                    eokVar.b.setEnabled(false);
                    eokVar.b.d(fma.bL(eokVar.F()));
                    return;
                } else {
                    eokVar.b.setEnabled(true);
                    eokVar.b.e(R.drawable.gs_phonelink_erase_vd_theme_24);
                    return;
                }
            case 19:
                eoy eoyVar = (eoy) obj;
                boolean z4 = eoyVar.a;
                Object obj12 = this.a;
                if (!z4) {
                    ((eol) obj12).d.setVisibility(8);
                    return;
                }
                eol eolVar = (eol) obj12;
                eolVar.d.setVisibility(0);
                eox eoxVar = eoyVar.b;
                if (eoxVar != eox.NO_RUNNING_OPERATION && !eoxVar.i) {
                    eolVar.d.setEnabled(false);
                    eolVar.d.d(iub.a(eolVar.y(), new itr(eolVar.y(), null, 0, R.style.Widget_Fmd_CircularProgressIndicator_FactoryResetProgressIndicatorStyle)));
                    return;
                } else {
                    eolVar.d.setEnabled(true);
                    eolVar.d.e(R.drawable.gs_phonelink_erase_vd_theme_24);
                    return;
                }
            default:
                eoy eoyVar2 = (eoy) obj;
                eox eoxVar2 = eoyVar2.b;
                Object obj13 = this.a;
                if (eoxVar2 == eox.SUCCEEDED) {
                    ((epj) obj13).aq.s();
                }
                if (eoyVar2.b.equals(eox.FAILED_MISC)) {
                    ((epj) obj13).aF(false);
                } else if (eoyVar2.b.equals(eox.FAILED_SCANNING) && !eoyVar2.c) {
                    ((epj) obj13).aF(true);
                }
                eox eoxVar3 = eoyVar2.b;
                if (eoxVar3 != eox.NO_RUNNING_OPERATION && !eoxVar3.i) {
                    epj epjVar = (epj) obj13;
                    epjVar.d.setVisibility(8);
                    epjVar.ah.setVisibility(8);
                    epjVar.e.setVisibility(8);
                    epjVar.ag.setVisibility(8);
                    epjVar.af.setVisibility(0);
                    return;
                }
                epj epjVar2 = (epj) obj13;
                epjVar2.d.setVisibility(0);
                epjVar2.ah.setVisibility(0);
                epjVar2.e.setVisibility(0);
                epjVar2.ag.setVisibility(0);
                epjVar2.af.setVisibility(8);
                return;
        }
    }
}
