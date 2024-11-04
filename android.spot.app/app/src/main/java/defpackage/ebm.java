package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ebm extends ebp {
    public lqc af;
    public eey ag;
    public ehr ah;
    private TextView ai;
    private Toolbar aj;
    private Button ak;

    @Override // defpackage.ag
    public final View J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 0;
        View inflate = LayoutInflater.from(y()).inflate(R.layout.fragment_full_screen_wipe_device, viewGroup, false);
        Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.toolbar);
        toolbar.getClass();
        this.aj = toolbar;
        toolbar.q(new he(this, 11, null));
        Button button = (Button) inflate.findViewById(R.id.btn_wipe);
        this.ak = button;
        button.setOnClickListener(new he(this, 12, null));
        this.ak.setAllCaps(true);
        this.ai = (TextView) inflate.findViewById(R.id.wipe_message);
        boolean z = A().getBoolean("hasCarKey");
        View findViewById = inflate.findViewById(R.id.car_key_deletion_notice_section);
        if (true != z) {
            i = 8;
        }
        findViewById.setVisibility(i);
        return inflate;
    }

    @Override // defpackage.ag
    public final void ad() {
        boolean z;
        jer g = this.ah.g();
        if (g.g() && (g.c() instanceof efa)) {
            efa efaVar = (efa) g.c();
            hwx.V(efaVar.f.g(), "UI not attached");
            if (efaVar.f.c() == this) {
                z = true;
            } else {
                z = false;
            }
            hwx.K(z, "detaching wrong UI");
            this.ag = null;
            efaVar.f = jdl.a;
        }
        super.ad();
    }

    @Override // defpackage.ag
    public final void af() {
        int i;
        int i2;
        super.af();
        jer g = this.ah.g();
        if (g.g() && (g.c() instanceof efa)) {
            efa efaVar = (efa) g.c();
            hwx.V(!efaVar.f.g(), "Rename device UI already attached");
            efaVar.f = jer.i(this);
            ((ebm) efaVar.f.c()).ag = efaVar.m;
            Object c = efaVar.f.c();
            lqc i3 = efaVar.i();
            ebm ebmVar = (ebm) c;
            ebmVar.af = i3;
            boolean s = eyf.s(i3);
            Button button = ebmVar.ak;
            int i4 = R.string.delete_profile;
            if (button != null) {
                if (s) {
                    i2 = R.string.delete_profile;
                } else {
                    i2 = R.string.erase_device;
                }
                button.setText(i2);
            }
            Toolbar toolbar = ebmVar.aj;
            if (toolbar != null) {
                if (true != s) {
                    i4 = R.string.erase_device;
                }
                toolbar.t(toolbar.getContext().getText(i4));
            }
            TextView textView = ebmVar.ai;
            if (textView != null) {
                if (true != s) {
                    i = R.string.fullscreen_wipe_device_fragment_message;
                } else {
                    i = R.string.fullscreen_wipe_device_fragment_message_for_profile;
                }
                textView.setText(i);
            }
        }
    }

    @Override // defpackage.v, defpackage.ag
    public final void g(Bundle bundle) {
        super.g(bundle);
        o(1, R.style.Theme_Fmd);
        G().Q("wipe_confirmation_result", this, new ehe(this, 1));
    }

    @Override // defpackage.v, defpackage.ag
    public final void k() {
        super.k();
        if (this.ai != null) {
            Context y = y();
            TextView textView = this.ai;
            textView.getClass();
            textView.getClass();
            fma.bQ(y, textView, textView.getText());
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [lqz, java.lang.Object] */
    @Override // defpackage.v, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        eey eeyVar = this.ag;
        if (eeyVar != null) {
            ((bym) eeyVar.a.a()).k(dxp.DEVICES);
        }
    }
}
