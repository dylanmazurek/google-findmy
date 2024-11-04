package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.BidiFormatter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.apps.adm.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ecr extends ect {
    public TextView a;
    public TextView af;
    public TextView ag;
    public ImageView ah;
    public View ai;
    public View aj;
    public View ak;
    public ProgressBar al;
    private final BidiFormatter am = BidiFormatter.getInstance();
    private ImageView an;
    private TextView ao;
    private LinearLayout ap;
    public View b;
    public ImageView c;
    public TextView d;
    public ImageView e;

    private final void cu(MaterialButton materialButton, ecq ecqVar) {
        materialButton.setEnabled(ecqVar.e);
        if (ecqVar.e) {
            materialButton.setOnClickListener(new ecp(this, ecqVar, 0));
        }
    }

    @Override // defpackage.ag
    public View J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_common_device_panel, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.common_device_panel_devices);
        this.ai = findViewById;
        this.ap = (LinearLayout) findViewById.findViewById(R.id.common_device_btn_panel);
        View findViewById2 = this.ai.findViewById(R.id.common_device_panel_info);
        findViewById2.addOnLayoutChangeListener(new ecu(this, 1));
        findViewById2.setOnClickListener(new he(this, 19, null));
        findViewById2.setSoundEffectsEnabled(false);
        this.an = (ImageView) findViewById2.findViewById(R.id.common_device_panel_niv_device_icon);
        this.ao = (TextView) findViewById2.findViewById(R.id.common_device_panel_device_title);
        this.a = (TextView) findViewById2.findViewById(R.id.common_device_panel_device_status);
        this.b = findViewById2.findViewById(R.id.common_device_panel_device_state);
        this.e = (ImageView) findViewById2.findViewById(R.id.common_device_panel_device_battery_icon);
        this.af = (TextView) findViewById2.findViewById(R.id.common_device_panel_device_battery_status);
        this.ag = (TextView) findViewById2.findViewById(R.id.common_device_panel_device_off_wrist_status);
        this.ah = (ImageView) findViewById2.findViewById(R.id.common_device_panel_device_off_wrist_icon);
        this.c = (ImageView) findViewById2.findViewById(R.id.common_device_panel_device_connectivity_icon);
        this.d = (TextView) findViewById2.findViewById(R.id.common_device_panel_device_connectivity_status);
        this.aj = findViewById2.findViewById(R.id.common_device_panel_btn_device_info);
        this.ak = findViewById2.findViewById(R.id.common_device_panel_btn_locate_device);
        this.al = (ProgressBar) this.ai.findViewById(R.id.common_device_panel_loading_view);
        this.e.setVisibility(8);
        this.af.setVisibility(8);
        this.c.setVisibility(8);
        this.d.setVisibility(8);
        this.b.setVisibility(8);
        this.aj.setVisibility(8);
        this.ak.setVisibility(4);
        this.al.setVisibility(4);
        return inflate;
    }

    public final void aF() {
        this.ak.setVisibility(0);
        this.al.setVisibility(4);
    }

    public final void aG() {
        this.ak.setVisibility(4);
        this.al.setVisibility(0);
    }

    public final MaterialCardView cv() {
        return (MaterialCardView) this.ai.findViewById(R.id.suggested_action_card);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void d(int i);

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(Iterable iterable) {
        this.ap.removeAllViews();
        LayoutInflater from = LayoutInflater.from(y());
        jmx it = ((jis) iterable).iterator();
        while (it.hasNext()) {
            ecq ecqVar = (ecq) it.next();
            if (ecqVar.d) {
                View inflate = from.inflate(R.layout.common_device_action_button, (ViewGroup) this.ap, false);
                MaterialButton materialButton = (MaterialButton) inflate.findViewById(R.id.action_button);
                cu(materialButton, ecqVar);
                if (ecqVar.f.g()) {
                    MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(R.id.suffix_icon_button);
                    materialButton2.d((Drawable) ecqVar.f.c());
                    materialButton2.setVisibility(0);
                    materialButton2.setContentDescription(ecqVar.c);
                    cu(materialButton2, ecqVar);
                }
                materialButton.d(ecqVar.b);
                materialButton.setText(ecqVar.c);
                this.ap.addView(inflate);
            }
        }
    }

    public final void o(lqc lqcVar) {
        eyf.l(lqcVar, this.an);
    }

    public final void p(String str) {
        this.ao.setText(this.am.unicodeWrap(str));
    }

    public final void q(lok lokVar) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        if (lokVar != null) {
            this.b.setVisibility(0);
        }
        ImageView imageView = this.e;
        TextView textView = this.af;
        String T = T(R.string.content_desc_battery_level);
        if (lokVar != null) {
            z = false;
        } else {
            z = true;
        }
        int i5 = eyf.a;
        if (lokVar != null) {
            i = lokVar.b;
        } else {
            i = 0;
        }
        if (lokVar != null) {
            i2 = lokVar.c;
        } else {
            i2 = 0;
        }
        if (lokVar != null) {
            i3 = a.D(lokVar.d);
            if (i3 == 0) {
                i3 = 1;
            }
        } else {
            i3 = 0;
        }
        boolean z2 = !z;
        if (z) {
            i4 = -1;
        } else {
            int a = eyf.a(i, i2, true);
            if (a == -1) {
                i4 = R.drawable.gs_battery_unknown_vd_theme_24;
            } else if (i3 == 2) {
                if (a <= 5 || a <= 25) {
                    i4 = R.drawable.quantum_gm_ic_battery_charging_20_vd_theme_24;
                } else if (a <= 40) {
                    i4 = R.drawable.quantum_gm_ic_battery_charging_30_vd_theme_24;
                } else if (a <= 55) {
                    i4 = R.drawable.quantum_gm_ic_battery_charging_50_vd_theme_24;
                } else if (a <= 70) {
                    i4 = R.drawable.quantum_gm_ic_battery_charging_60_vd_theme_24;
                } else if (a <= 85) {
                    i4 = R.drawable.quantum_gm_ic_battery_charging_80_vd_theme_24;
                } else if (a <= 95) {
                    i4 = R.drawable.quantum_gm_ic_battery_charging_90_vd_theme_24;
                } else {
                    i4 = R.drawable.gs_battery_charging_full_vd_theme_24;
                }
            } else if (a <= 15) {
                i4 = R.drawable.gs_battery_alert_vd_theme_24;
            } else if (a <= 25) {
                i4 = R.drawable.quantum_gm_ic_battery_20_vd_theme_24;
            } else if (a <= 40) {
                i4 = R.drawable.quantum_gm_ic_battery_30_vd_theme_24;
            } else if (a <= 55) {
                i4 = R.drawable.quantum_gm_ic_battery_50_vd_theme_24;
            } else if (a <= 70) {
                i4 = R.drawable.quantum_gm_ic_battery_60_vd_theme_24;
            } else if (a <= 85) {
                i4 = R.drawable.quantum_gm_ic_battery_80_vd_theme_24;
            } else if (a <= 95) {
                i4 = R.drawable.quantum_gm_ic_battery_90_vd_theme_24;
            } else {
                i4 = R.drawable.gs_battery_full_vd_theme_24;
            }
        }
        int a2 = eyf.a(i, i2, z2);
        if (!z && a2 != -1) {
            Integer valueOf = Integer.valueOf(a2);
            eyf.n(imageView, textView, String.format("%s%%", valueOf), i4, false, String.format(T, String.format("%s%%", valueOf)));
        } else {
            imageView.setVisibility(8);
            textView.setVisibility(8);
        }
    }
}
