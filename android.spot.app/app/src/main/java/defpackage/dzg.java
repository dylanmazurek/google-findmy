package defpackage;

import android.content.Context;
import android.text.BidiFormatter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.adm.R;
import com.google.android.material.card.MaterialCardView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dzg extends mh {
    private final View A;
    private final TextView B;
    private final ViewGroup C;
    private final ImageView D;
    public final ewf r;
    public final bym s;
    private final BidiFormatter t;
    private final MaterialCardView u;
    private final TextView v;
    private final TextView w;
    private final ImageView x;
    private final TextView y;
    private final TextView z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public dzg(android.view.ViewGroup r3, android.text.BidiFormatter r4, defpackage.bym r5, defpackage.ewf r6, int r7) {
        /*
            r2 = this;
            r4.getClass()
            r5.getClass()
            r6.getClass()
            android.content.Context r0 = r3.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 0
            android.view.View r3 = r0.inflate(r7, r3, r1)
            r3.getClass()
            r2.<init>(r3)
            r2.t = r4
            r2.s = r5
            r2.r = r6
            android.view.View r3 = r2.b
            r4 = 2131362116(0x7f0a0144, float:1.8344003E38)
            android.view.View r3 = r3.findViewById(r4)
            r3.getClass()
            com.google.android.material.card.MaterialCardView r3 = (com.google.android.material.card.MaterialCardView) r3
            r2.u = r3
            r4 = 2131362142(0x7f0a015e, float:1.8344056E38)
            android.view.View r4 = r3.findViewById(r4)
            r4.getClass()
            android.widget.TextView r4 = (android.widget.TextView) r4
            r2.v = r4
            r4 = 2131362572(0x7f0a030c, float:1.8344928E38)
            android.view.View r4 = r3.findViewById(r4)
            r4.getClass()
            android.widget.TextView r4 = (android.widget.TextView) r4
            r2.w = r4
            r4 = 2131362573(0x7f0a030d, float:1.834493E38)
            android.view.View r4 = r3.findViewById(r4)
            r4.getClass()
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r2.x = r4
            r4 = 2131362331(0x7f0a021b, float:1.834444E38)
            android.view.View r4 = r3.findViewById(r4)
            r4.getClass()
            android.widget.TextView r4 = (android.widget.TextView) r4
            r2.y = r4
            r4 = 2131362563(0x7f0a0303, float:1.834491E38)
            android.view.View r4 = r3.findViewById(r4)
            r4.getClass()
            android.widget.TextView r4 = (android.widget.TextView) r4
            r2.z = r4
            r4 = 2131362565(0x7f0a0305, float:1.8344914E38)
            android.view.View r4 = r3.findViewById(r4)
            r4.getClass()
            r2.A = r4
            r4 = 2131362134(0x7f0a0156, float:1.834404E38)
            android.view.View r4 = r3.findViewById(r4)
            r4.getClass()
            android.widget.TextView r4 = (android.widget.TextView) r4
            r2.B = r4
            r4 = 2131362754(0x7f0a03c2, float:1.8345298E38)
            android.view.View r4 = r3.findViewById(r4)
            r4.getClass()
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r2.C = r4
            r4 = 2131362287(0x7f0a01ef, float:1.834435E38)
            android.view.View r3 = r3.findViewById(r4)
            r3.getClass()
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r2.D = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dzg.<init>(android.view.ViewGroup, android.text.BidiFormatter, bym, ewf, int):void");
    }

    @Override // defpackage.mh
    public final void A(dzp dzpVar) {
        ls lsVar;
        int i;
        float f;
        int i2;
        if (dzpVar instanceof dzf) {
            dzf dzfVar = (dzf) dzpVar;
            dzs dzsVar = dzfVar.a;
            this.u.setVisibility(0);
            this.v.setText(this.t.unicodeWrap(dzsVar.a.g));
            eyf.l(dzsVar.a, this.D);
            ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
            String str = null;
            if (layoutParams instanceof ls) {
                lsVar = (ls) layoutParams;
            } else {
                lsVar = null;
            }
            if (lsVar != null) {
                if (true != dzfVar.d) {
                    i2 = R.dimen.adm_devicepicker_default_spacing;
                } else {
                    i2 = R.dimen.adm_devicepicker_group_spacing;
                }
                lsVar.bottomMargin = this.b.getResources().getDimensionPixelOffset(i2);
            }
            MaterialCardView materialCardView = this.u;
            Context context = this.b.getContext();
            if (dzfVar.c) {
                if (dzfVar.d) {
                    i = R.style.ShapeAppearance_Fmd_DevicePickerItem_AllCorners;
                } else {
                    i = R.style.ShapeAppearance_Fmd_DevicePickerItem_Top;
                }
            } else if (dzfVar.d) {
                i = R.style.ShapeAppearance_Fmd_DevicePickerItem_Bottom;
            } else {
                i = R.style.ShapeAppearance_Fmd_DevicePickerItem;
            }
            materialCardView.cy(new ivl(ivl.b(context, i, 0)));
            this.C.setVisibility(8);
            dzs dzsVar2 = dzfVar.a;
            if (dzsVar2.b) {
                this.C.setVisibility(0);
                this.B.setVisibility(0);
                this.w.setVisibility(8);
                this.x.setVisibility(8);
                this.y.setVisibility(8);
                this.A.setVisibility(8);
            } else {
                boolean z = dzsVar2.c;
                lqc lqcVar = dzsVar2.a;
                lqcVar.getClass();
                if (eyf.t(lqcVar)) {
                    String str2 = (String) dzsVar2.d.f();
                    if (str2 == null || (str = this.b.getContext().getString(R.string.adm_devicepicker_status_pending_with_validation_code, this.t.unicodeWrap(str2))) == null) {
                        str = this.b.getContext().getString(R.string.adm_devicepicker_status_pending);
                    }
                } else if (eyf.e(dzsVar2.a) != kye.DEFAULT_NOT_SHARED) {
                    str = this.b.getContext().getString(R.string.adm_devicepicker_status_shared);
                }
                boolean z2 = dzsVar2.e;
                if (str == null && !z) {
                    if (z2) {
                        z2 = true;
                    }
                }
                this.C.setVisibility(0);
                this.B.setVisibility(8);
                if (z) {
                    this.w.setVisibility(0);
                    this.w.setText(R.string.adm_devicepicker_status_nearby);
                    this.x.setVisibility(8);
                } else if (z2) {
                    this.w.setVisibility(0);
                    this.w.setText(R.string.adm_devicepicker_status_lost);
                    this.x.setVisibility(0);
                } else {
                    this.w.setVisibility(8);
                    this.x.setVisibility(8);
                }
                if (str != null) {
                    this.y.setVisibility(this.w.getVisibility());
                    this.A.setVisibility(0);
                    this.z.setText(str);
                } else {
                    this.A.setVisibility(8);
                    this.y.setVisibility(8);
                }
            }
            View childAt = this.u.getChildAt(0);
            if (true != dzfVar.b) {
                f = 0.5f;
            } else {
                f = 1.0f;
            }
            childAt.setAlpha(f);
            if (dzfVar.b) {
                this.u.setOnClickListener(new ecp(this, dzfVar, 1));
                return;
            } else {
                this.u.setClickable(false);
                return;
            }
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // defpackage.mh
    public final void z() {
        ImageView imageView = this.D;
        dgo.d(imageView).f(imageView);
    }
}
