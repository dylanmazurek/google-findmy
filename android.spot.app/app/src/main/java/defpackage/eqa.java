package defpackage;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.adm.R;
import com.google.android.material.button.MaterialButton;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eqa extends eqc {
    private static final jnk ak = jnk.l("com/google/android/apps/adm/integrations/spot/markaslost/ContactInfoFragment");
    public evo a;
    public MaterialButton af;
    public TextView ag;
    public TextView ah;
    public TextView ai;
    public dhx aj;
    private lqd al;
    private boolean am;
    public eqb b;
    public boolean c;
    public MaterialButton d;
    public MaterialButton e;

    public static eqa a(lqd lqdVar, kxz kxzVar, boolean z, boolean z2) {
        eqa eqaVar = new eqa();
        Bundle bundle = new Bundle();
        eyf.m(lqdVar, bundle);
        kzy.m(bundle, "INITIAL_CONTACT_INFO", kxzVar);
        bundle.putBoolean("SHOW_EMAIL_FIELD", z);
        bundle.putBoolean("CAN_EDIT_CONTACT_INFO", z2);
        eqaVar.ak(bundle);
        return eqaVar;
    }

    @Override // defpackage.ag
    public final View J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_contact_info, viewGroup, false);
        cs csVar = (cs) F();
        csVar.i((Toolbar) inflate.findViewById(R.id.contact_info_toolbar));
        ch g = csVar.g();
        g.getClass();
        g.g(true);
        ch g2 = csVar.g();
        g2.getClass();
        g2.s();
        ch g3 = csVar.g();
        g3.getClass();
        g3.j(T(R.string.contact_info_fragment_title));
        this.ag = (TextView) inflate.findViewById(R.id.contact_info_preview_owner_message_text);
        this.ah = (TextView) inflate.findViewById(R.id.contact_info_preview_call_owner_text);
        this.ai = (TextView) inflate.findViewById(R.id.contact_info_preview_email_address_text);
        this.e = (MaterialButton) inflate.findViewById(R.id.contact_info_add_owner_message_button);
        this.d = (MaterialButton) inflate.findViewById(R.id.contact_info_add_phone_number_button);
        this.af = (MaterialButton) inflate.findViewById(R.id.contact_info_include_email_address_button);
        TextView textView = (TextView) inflate.findViewById(R.id.contact_info_text);
        eqb eqbVar = this.b;
        jer b = eyf.b(eqbVar.b.c(), (lqd) eqbVar.c.c());
        hwx.V(b.g(), "initialize() should be called before using this object.");
        String str = ((lqc) b.c()).g;
        if (TextUtils.isEmpty(str)) {
            str = T(R.string.contact_info_text_content_for_device_name_placeholder);
        }
        lqf b2 = lqf.b(this.al.c);
        if (b2 == null) {
            b2 = lqf.UNRECOGNIZED;
        }
        if (b2 == lqf.ANDROID_DEVICE) {
            textView.setText(U(R.string.contact_info_text_content_for_phone, str));
            inflate.findViewById(R.id.contact_info_preview_locked_text).setVisibility(0);
        } else {
            textView.setText(U(R.string.contact_info_text_content_for_accessory, str));
            inflate.findViewById(R.id.contact_info_preview_locked_text).setVisibility(8);
        }
        if (this.am) {
            this.ah.setEnabled(true);
            this.ag.setEnabled(true);
            this.ai.setEnabled(true);
            this.af.setEnabled(true);
            this.d.setEnabled(true);
            this.e.setEnabled(true);
        } else {
            this.ah.setEnabled(false);
            this.ag.setEnabled(false);
            this.ai.setEnabled(false);
            this.af.setEnabled(false);
            this.d.setEnabled(false);
            this.e.setEnabled(false);
        }
        return inflate;
    }

    @Override // defpackage.ag
    public final void af() {
        super.af();
        if (!this.am) {
            dhx dhxVar = this.aj;
            exu a = evj.a();
            a.f(-2);
            dhxVar.l(R.string.device_marked_as_lost_by_other_owner, null, a.e());
        }
    }

    @Override // defpackage.ag
    public final void ag(View view, Bundle bundle) {
        this.b.d.g(O(), new epy(this, 0));
        ((cfk) this.aj.a).g(O(), new epy(this, 2));
    }

    @Override // defpackage.ag
    public final void ct() {
        Bundle bundle = new Bundle();
        kxz kxzVar = (kxz) this.b.d.d();
        kxzVar.getClass();
        kzy.m(bundle, "CONTACT_INFO_FRAGMENT_RESULT", kxzVar);
        H().P("CONTACT_INFO_FRAGMENT_RESULT", bundle);
        super.ct();
    }

    @Override // defpackage.ag
    public final void g(Bundle bundle) {
        super.g(bundle);
        this.al = eyf.g(A());
        try {
            kxz kxzVar = (kxz) kzy.j(A(), "INITIAL_CONTACT_INFO", kxz.d, lja.a());
            this.am = A().getBoolean("CAN_EDIT_CONTACT_INFO");
            this.c = A().getBoolean("SHOW_EMAIL_FIELD");
            G().Q(eqq.PHONE_NUMBER.c, this, new ehe(this, 8));
            G().Q(eqq.OWNER_MESSAGE.c, this, new ehe(this, 9));
            eqb eqbVar = (eqb) new ddh((cgq) this).q(eqb.class);
            this.b = eqbVar;
            lqd lqdVar = this.al;
            lqdVar.getClass();
            kxzVar.getClass();
            if (eqbVar.c.g()) {
                hwx.V(((ljn) eqbVar.c.c()).equals(lqdVar), "This class can only initialized for one device identifier");
            } else {
                eqbVar.c = jer.i(lqdVar);
                eqbVar.d.l(kxzVar);
            }
        } catch (ljy unused) {
            ((jni) ((jni) ak.f()).j("com/google/android/apps/adm/integrations/spot/markaslost/ContactInfoFragment", "onCreate", 107, "ContactInfoFragment.java")).r("Unable to parse ContactInfo");
        }
    }
}
