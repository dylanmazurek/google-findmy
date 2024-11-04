package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.adm.R;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class etj extends etf {
    public static final jnk a = jnk.l("com/google/android/apps/adm/integrations/spot/sharing/application/SharingApplicationRequirementsFragment");
    public eto af;
    public dhx ag;
    private pf ah;
    private TextView ai;
    private TextView aj;
    private TextView ak;
    private ImageView al;
    private TextView am;
    private Button an;
    private MaterialButton ao;
    public pk b;
    public evo c;
    public etq d;
    public pf e;

    @Override // defpackage.ag
    public final View J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.sharing_application_requirements, (ViewGroup) null);
        MaterialToolbar materialToolbar = (MaterialToolbar) inflate.findViewById(R.id.sharing_application_requirements_toolbar);
        cs csVar = (cs) F();
        csVar.i(materialToolbar);
        ch g = csVar.g();
        g.getClass();
        g.t();
        g.g(true);
        g.s();
        this.ai = (TextView) inflate.findViewById(R.id.header_text);
        this.aj = (TextView) inflate.findViewById(R.id.explanation_text);
        TextView textView = (TextView) inflate.findViewById(R.id.learn_more_text);
        this.ak = textView;
        textView.setOnClickListener(new eph(this, 13));
        this.al = (ImageView) inflate.findViewById(R.id.explanatory_image);
        this.am = (TextView) inflate.findViewById(R.id.can_be_turned_off);
        Button button = (Button) inflate.findViewById(R.id.negative_button);
        this.an = button;
        button.setOnClickListener(new eph(this, 14));
        MaterialButton materialButton = (MaterialButton) inflate.findViewById(R.id.positive_button);
        this.ao = materialButton;
        materialButton.setOnClickListener(new eph(this, 15));
        return inflate;
    }

    @Override // defpackage.ag
    public final void af() {
        super.af();
        etq etqVar = this.d;
        if (etqVar.a().a == etn.TURN_ON_FIND_MY_DEVICE) {
            ((jni) ((jni) etq.a.e()).j("com/google/android/apps/adm/integrations/spot/sharing/application/SharingApplicationRequirementsViewModel", "onResumed", 278, "SharingApplicationRequirementsViewModel.java")).r("onResumed while state is TURN_ON_FIND_MY_DEVICE");
            etqVar.m(new ah(etqVar, 15));
        }
    }

    @Override // defpackage.ag
    public final void ag(View view, Bundle bundle) {
        this.d.f.g(O(), new epy(this, 16));
        ((cfk) this.ag.a).g(O(), new epy(this, 17));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void d() {
        jer jerVar;
        switch (this.d.a().a) {
            case USE_RESPONSIBLY:
                jerVar = jer.i(lua.a.a().I());
                break;
            case TURN_ON_LOCATION:
            case TURN_ON_FIND_MY_DEVICE:
            case TERMINATED:
                ((jni) ((jni) a.g()).j("com/google/android/apps/adm/integrations/spot/sharing/application/SharingApplicationRequirementsFragment", "getLearnMoreUrl", 185, "SharingApplicationRequirementsFragment.java")).u("Unexpected learn more click on state %s", this.d.a());
                jerVar = jdl.a;
                break;
            case SET_UP_SCREEN_LOCK:
                jerVar = jer.i(lua.a.a().G());
                break;
            case TURN_ON_LAST_KNOWN_LOCATION:
                jerVar = jer.i(lua.a.a().H());
                break;
            case JOIN_FIND_MY_DEVICE_NETWORK:
                jerVar = jer.i(lua.a.a().F());
                break;
            default:
                jerVar = jdl.a;
                break;
        }
        if (!jerVar.g()) {
            return;
        }
        try {
            as(new Intent("android.intent.action.VIEW", Uri.parse((String) jerVar.c())));
        } catch (ActivityNotFoundException e) {
            ((jni) ((jni) ((jni) a.f()).i(e)).j("com/google/android/apps/adm/integrations/spot/sharing/application/SharingApplicationRequirementsFragment", "onLearnMoreClicked", 168, "SharingApplicationRequirementsFragment.java")).u("Could not launch learn more activity for URI %s", jerVar);
        }
    }

    public final void e() {
        switch (this.d.a().a) {
            case USE_RESPONSIBLY:
                etq etqVar = this.d;
                eto etoVar = this.af;
                if (etqVar.a().a != etn.USE_RESPONSIBLY) {
                    ((jni) ((jni) etq.a.g()).j("com/google/android/apps/adm/integrations/spot/sharing/application/SharingApplicationRequirementsViewModel", "confirmUseResponsibly", 285, "SharingApplicationRequirementsViewModel.java")).u("confirmUseResponsibly called when state is unexpectedly %s", etqVar.a().a);
                    return;
                }
                etqVar.e();
                etqVar.d(lnb.SHARING_APPLICATION_USE_RESPONSIBLY_CONFIRMED);
                synchronized (etqVar.i) {
                    etqVar.k = iuu.t(new etm(etqVar, etoVar, 2), etqVar.e).e(new eoc(etqVar, 17), etqVar.e).a(Exception.class, new eoc(etqVar, 18), etqVar.e);
                }
                return;
            case TURN_ON_LOCATION:
                etq etqVar2 = this.d;
                if (etqVar2.a().a != etn.TURN_ON_LOCATION) {
                    ((jni) ((jni) etq.a.g()).j("com/google/android/apps/adm/integrations/spot/sharing/application/SharingApplicationRequirementsViewModel", "turnOnLocation", 338, "SharingApplicationRequirementsViewModel.java")).u("turnOnLocation called when state is unexpectedly %s", etqVar2.a().a);
                    return;
                }
                etqVar2.e();
                etqVar2.d(lnb.SHARING_APPLICATION_TURN_ON_LOCATION_REQUESTED);
                if (etqVar2.o()) {
                    etqVar2.d(lnb.SHARING_APPLICATION_TURN_ON_LOCATION_SUCCESS);
                    etqVar2.k();
                    return;
                } else {
                    synchronized (etqVar2.i) {
                        etqVar2.j = iuu.t(new eli(etqVar2, 4), etqVar2.e).e(new eoc(etqVar2, 13), etqVar2.e).a(fhy.class, new eoc(etqVar2, 20), etqVar2.e).a(Exception.class, new eoc(etqVar2, 14), etqVar2.e);
                    }
                    return;
                }
            case SET_UP_SCREEN_LOCK:
                try {
                    this.ah.b(new Intent("android.app.action.SET_NEW_PASSWORD"));
                    this.d.i(true);
                    return;
                } catch (ActivityNotFoundException e) {
                    ((jni) ((jni) ((jni) a.f()).i(e)).j("com/google/android/apps/adm/integrations/spot/sharing/application/SharingApplicationRequirementsFragment", "onPositiveButtonClicked", (char) 227, "SharingApplicationRequirementsFragment.java")).r("Failed opening the screen lock activity");
                    this.d.i(false);
                    this.d.f();
                    return;
                }
            case TURN_ON_FIND_MY_DEVICE:
                try {
                    as(new Intent("com.google.android.gms.settings.FIND_MY_DEVICE_SETTINGS"));
                    this.d.g(true);
                    return;
                } catch (ActivityNotFoundException e2) {
                    ((jni) ((jni) ((jni) a.f()).i(e2)).j("com/google/android/apps/adm/integrations/spot/sharing/application/SharingApplicationRequirementsFragment", "onPositiveButtonClicked", (char) 240, "SharingApplicationRequirementsFragment.java")).r("Failed opening the Find My Device settings activity");
                    this.d.g(false);
                    this.d.f();
                    return;
                }
            case TURN_ON_LAST_KNOWN_LOCATION:
                this.d.n(this.af);
                return;
            case JOIN_FIND_MY_DEVICE_NETWORK:
                this.d.b(this.af);
                return;
            case TERMINATED:
                ((jni) ((jni) a.g()).j("com/google/android/apps/adm/integrations/spot/sharing/application/SharingApplicationRequirementsFragment", "onPositiveButtonClicked", 252, "SharingApplicationRequirementsFragment.java")).u("Unexpected positive button click on state %s", this.d.a());
                return;
            default:
                return;
        }
    }

    @Override // defpackage.ag
    public final void g(Bundle bundle) {
        super.g(bundle);
        lqd g = eyf.g(A());
        lmu lmuVar = (lmu) kzy.k(A(), "event_context", lmu.i, lja.a());
        jnk jnkVar = etq.a;
        etq etqVar = (etq) new ddh((cgq) this).q(etq.class);
        if (etqVar.g == null) {
            etqVar.g = g;
            etqVar.h = jer.h(lmuVar);
        }
        boolean z = false;
        if (Objects.equals(g, etqVar.g) && Objects.equals(lmuVar, etqVar.h.f())) {
            z = true;
        }
        hwx.K(z, "The ViewModel was first initialized with different logging context arguments");
        this.d = etqVar;
        this.e = M(new pr(), this.b, new dyd(this, 10));
        this.ah = M(new pq(), this.b, new dyd(this, 11));
    }

    public final void o(int i, int i2, jer jerVar, int i3, int i4, int i5, boolean z, boolean z2) {
        this.ai.setText(i);
        this.aj.setText(i2);
        int i6 = 8;
        if (jerVar.g()) {
            this.ak.setVisibility(0);
            this.ak.setText(((eti) jerVar.c()).a);
            this.ak.setContentDescription(T(((eti) jerVar.c()).b));
        } else {
            this.ak.setVisibility(8);
        }
        this.al.setImageResource(i3);
        TextView textView = this.am;
        if (true == z2) {
            i6 = 0;
        }
        textView.setVisibility(i6);
        this.ao.setText(i4);
        this.an.setText(i5);
        if (z) {
            this.ao.setEnabled(false);
            this.ao.d(fma.bL(F()));
            this.an.setEnabled(false);
        } else {
            this.ao.setEnabled(true);
            this.ao.d(null);
            this.an.setEnabled(true);
        }
        this.af = new eto(jis.q(Integer.valueOf(i)), jis.q(Integer.valueOf(i2)), jis.q(Integer.valueOf(i4)), jis.q(Integer.valueOf(i5)));
    }
}
