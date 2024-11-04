package defpackage;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.BidiFormatter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.adm.R;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.card.MaterialCardView;
import j$.util.Collection;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ehg extends eha {
    public static final jnk a = jnk.l("com/google/android/apps/adm/integrations/android/securedevice/SecureDeviceFragment");
    public lqd af;
    public boolean ag;
    public boolean ah;
    public Button ai;
    public CollapsingToolbarLayout aj;
    public View ak;
    public TextView al;
    public TextView am;
    public ebf an;
    public dhx ao;
    public ehf b;
    public BidiFormatter c;
    public evo d;
    public ehk e;

    @Override // defpackage.ag
    public final View J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_secure_device, viewGroup, false);
        cs csVar = (cs) F();
        csVar.i((Toolbar) inflate.findViewById(R.id.secure_device_toolbar));
        ch g = csVar.g();
        g.getClass();
        g.g(true);
        g.s();
        this.aj = (CollapsingToolbarLayout) inflate.findViewById(R.id.secure_device_collapsing_toolbar);
        this.ak = inflate.findViewById(R.id.progress_bar_view);
        this.al = (TextView) inflate.findViewById(R.id.progress_bar_text);
        lqc a2 = this.e.a();
        ((TextView) inflate.findViewById(R.id.device_name)).setText(this.c.unicodeWrap(a2.g));
        eyf.l(a2, (ImageView) inflate.findViewById(R.id.device_icon));
        MaterialCardView materialCardView = (MaterialCardView) inflate.findViewById(R.id.add_contact_info_card);
        materialCardView.setOnClickListener(new efe(this, 7));
        ((ImageView) materialCardView.findViewById(R.id.add_contact_info_button_arrow)).getDrawable().setAutoMirrored(true);
        TextView textView = (TextView) materialCardView.findViewById(R.id.add_contact_info_title);
        this.am = textView;
        d(textView);
        int i = 8;
        if (ltu.c()) {
            materialCardView.setVisibility(8);
            inflate.findViewById(R.id.optional_features_title).setVisibility(8);
        }
        Button button = (Button) inflate.findViewById(R.id.secure_device_button);
        this.ai = button;
        button.setOnClickListener(new efe(this, i));
        return inflate;
    }

    @Override // defpackage.ag
    public final void ag(View view, Bundle bundle) {
        boolean z;
        ehk ehkVar = this.e;
        if (ehkVar.b != null) {
            z = true;
        } else {
            z = false;
        }
        hwx.U(z);
        ehkVar.f.g(O(), new cfo() { // from class: ehd
            @Override // defpackage.cfo
            public final void d(Object obj) {
                lpt lptVar;
                lpt lptVar2;
                ehj ehjVar = (ehj) obj;
                ehg ehgVar = ehg.this;
                lqc a2 = ehgVar.e.a();
                if (!ehjVar.b && !ehjVar.c) {
                    jer jerVar = ehjVar.a;
                    int i = 1;
                    int i2 = 0;
                    if (jerVar.g()) {
                        Object c = jerVar.c();
                        ehgVar.ak.setVisibility(0);
                        ehgVar.al.setVisibility(0);
                        int ordinal = ((ehi) c).ordinal();
                        if (ordinal != 0) {
                            if (ordinal != 1) {
                                if (ordinal != 2) {
                                    return;
                                }
                            } else {
                                ehgVar.al.setText(R.string.mark_as_found_loading_text);
                                return;
                            }
                        }
                        ehgVar.al.setText(R.string.mark_as_lost_loading_text);
                        return;
                    }
                    ehgVar.ak.setVisibility(8);
                    ehgVar.al.setVisibility(8);
                    if (a2.b == 3) {
                        lptVar = (lpt) a2.c;
                    } else {
                        lptVar = lpt.C;
                    }
                    if ((lptVar.a & 67108864) != 0) {
                        int ordinal2 = ehgVar.b.ordinal();
                        if (ordinal2 != 0) {
                            if (ordinal2 == 1) {
                                View K = ehgVar.K();
                                ehgVar.aj.e(ehgVar.T(R.string.secure_device));
                                ((TextView) K.findViewById(R.id.mark_as_lost_button_title)).setText(R.string.mark_as_lost);
                                ((TextView) K.findViewById(R.id.mark_as_lost_button_subtitle)).setText(R.string.secure_and_mark_as_lost_button_subtext);
                                MaterialCardView materialCardView = (MaterialCardView) K.findViewById(R.id.mark_as_lost_card);
                                materialCardView.setVisibility(0);
                                CheckBox checkBox = (CheckBox) K.findViewById(R.id.mark_as_lost_button_checkbox);
                                checkBox.setOnCheckedChangeListener(new ipp(ehgVar, i));
                                materialCardView.setOnClickListener(new efe(checkBox, 9));
                                K.findViewById(R.id.mark_as_found_button).setVisibility(8);
                            }
                        } else {
                            View K2 = ehgVar.K();
                            ((ImageView) K2.findViewById(R.id.info_p0_icon)).setVisibility(0);
                            ((TextView) K2.findViewById(R.id.info_p0_text)).setVisibility(0);
                            ((TextView) K2.findViewById(R.id.info_p0_text)).setText(R.string.youll_be_notified_text);
                            K2.findViewById(R.id.mark_as_lost_card).setVisibility(8);
                            Button button = (Button) K2.findViewById(R.id.mark_as_found_button);
                            lqc a3 = ehgVar.e.a();
                            if (a3.b == 3) {
                                lptVar2 = (lpt) a3.c;
                            } else {
                                lptVar2 = lpt.C;
                            }
                            lpz lpzVar = lptVar2.u;
                            if (lpzVar == null) {
                                lpzVar = lpz.e;
                            }
                            kyf kyfVar = lpzVar.b;
                            if (kyfVar == null) {
                                kyfVar = kyf.r;
                            }
                            kzc kzcVar = kyfVar.d;
                            if (kzcVar == null) {
                                kzcVar = kzc.c;
                            }
                            if (eku.k(kzcVar)) {
                                ehgVar.aj.e(ehgVar.T(R.string.mark_as_lost_fragment_title_lost_device));
                                ((TextView) K2.findViewById(R.id.optional_features_title)).setVisibility(8);
                                K2.findViewById(R.id.add_contact_info_card).setVisibility(8);
                                ((Button) K2.findViewById(R.id.secure_device_button)).setVisibility(8);
                                button.setVisibility(0);
                                button.setOnClickListener(new efe(ehgVar, 10));
                            } else {
                                ehgVar.aj.e(ehgVar.T(R.string.mark_as_lost_fragment_title_found_device));
                                ((TextView) K2.findViewById(R.id.optional_features_title)).setVisibility(0);
                                K2.findViewById(R.id.add_contact_info_card).setVisibility(0);
                                ((Button) K2.findViewById(R.id.secure_device_button)).setVisibility(0);
                                button.setVisibility(8);
                                ehgVar.e.b(true);
                            }
                        }
                    } else {
                        hwx.O(ehgVar.b.equals(ehf.SECURE_DEVICE), "ui Type mismatch %s", ehgVar.b);
                        View K3 = ehgVar.K();
                        ehgVar.aj.e(ehgVar.T(R.string.secure_device));
                        K3.findViewById(R.id.mark_as_found_button).setVisibility(8);
                        K3.findViewById(R.id.mark_as_lost_card).setVisibility(8);
                        ehgVar.e.b(false);
                    }
                    boolean anyMatch = Collection.EL.stream(a2.e).anyMatch(new ehc(lpk.ANDROID_SET_SCREEN_LOCK_PASSWORD, i2));
                    ehgVar.ah = anyMatch;
                    if (anyMatch) {
                        ehgVar.ai.setText(R.string.continue_button_text);
                        return;
                    } else if (ehgVar.b.equals(ehf.SECURE_DEVICE)) {
                        ehgVar.ai.setText(ehgVar.U(R.string.secure_device_button_text, a2.g));
                        return;
                    } else {
                        if (ehgVar.b.equals(ehf.MARK_AS_LOST)) {
                            ehgVar.ai.setText(R.string.mark_as_lost);
                            return;
                        }
                        return;
                    }
                }
                ehgVar.H().L();
            }
        });
        ((cfk) this.ao.a).g(O(), new egv(this, 3));
    }

    public final void d(TextView textView) {
        ehk ehkVar = this.e;
        boolean g = ehkVar.c.g();
        int i = R.string.contact_info_fragment_title;
        if (g) {
            kxz kxzVar = (kxz) ehkVar.c.c();
            if (!kxzVar.c.isEmpty() || !kxzVar.a.isEmpty() || !kxzVar.b.isEmpty()) {
                i = R.string.contact_info_fragment_title_already_populated;
            }
        }
        textView.setText(i);
    }

    public final int e() {
        if (!this.e.d()) {
            return 1;
        }
        if (this.b == ehf.MARK_AS_LOST) {
            return 3;
        }
        return 2;
    }

    @Override // defpackage.ag
    public final void g(Bundle bundle) {
        super.g(bundle);
        this.af = eyf.g(A());
        int i = 0;
        this.ag = A().getBoolean("HAS_CAR_KEYS", false);
        this.b = (ehf) Enum.valueOf(ehf.class, A().getString("UI_TYPE", ""));
        lqd lqdVar = this.af;
        ehk ehkVar = (ehk) new ddh((cgq) this).q(ehk.class);
        if (ehkVar.b == null) {
            ehkVar.b = lqdVar;
        }
        hwx.S(ehkVar.b.equals(lqdVar), "The provided DeviceIdentifier %s is different than the one the ViewModel was first initialized with, %s", lqdVar, ehkVar.b);
        this.e = ehkVar;
        H().Q("CONTACT_INFO_FRAGMENT_RESULT", this, new ehe(this, i));
        H().Q("SET_PASSWORD_FRAGMENT_RESULT", this, new ehe(this, 2));
    }
}
