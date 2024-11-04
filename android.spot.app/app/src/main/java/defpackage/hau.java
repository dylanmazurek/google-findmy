package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.adm.R;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hau extends ConstraintLayout implements hjs {
    public final MaterialButton i;
    public final MaterialButton j;
    public final MaterialButton k;
    public final ImageView l;
    public final ImageView m;
    public final ArrayList n;
    public hiw o;
    public lnh p;
    public bui q;
    public has r;
    public hgw s;
    public hjp t;

    public hau(Context context) {
        super(context, null);
        this.n = new ArrayList();
        LayoutInflater.from(context).inflate(R.layout.policy_footer, this);
        this.i = (MaterialButton) findViewById(R.id.og_privacy_policy_button);
        this.j = (MaterialButton) findViewById(R.id.og_tos_button);
        this.k = (MaterialButton) findViewById(R.id.og_custom_button);
        this.l = (ImageView) findViewById(R.id.og_separator1);
        this.m = (ImageView) findViewById(R.id.og_separator2);
        getResources().getDimensionPixelSize(R.dimen.og_footer_added_separator_margin);
    }

    public static void f(MaterialButton materialButton) {
        materialButton.setMaxLines(3);
        materialButton.setEllipsize(null);
    }

    @Override // defpackage.hjs
    public final void b(hjp hjpVar) {
        hjpVar.c(this.i, 90532);
        hjpVar.c(this.j, 90533);
        hjpVar.c(this.k, 90534);
    }

    @Override // defpackage.hjs
    public final void cU(hjp hjpVar) {
        hjpVar.e(this.i);
        hjpVar.e(this.j);
        hjpVar.e(this.k);
    }

    public final View.OnClickListener g(final gyy gyyVar, final int i) {
        hha hhaVar = new hha(new View.OnClickListener() { // from class: har
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hau hauVar = hau.this;
                hiw hiwVar = hauVar.o;
                Object a = hauVar.q.a();
                lnh lnhVar = hauVar.p;
                ljh ljhVar = (ljh) lnhVar.z(5);
                ljhVar.w(lnhVar);
                if (!ljhVar.b.y()) {
                    ljhVar.t();
                }
                gyy gyyVar2 = gyyVar;
                int i2 = i;
                lnh lnhVar2 = (lnh) ljhVar.b;
                lnh lnhVar3 = lnh.g;
                lnhVar2.b = i2 - 1;
                lnhVar2.a |= 1;
                hiwVar.a(a, (lnh) ljhVar.q());
                hauVar.t.f(new bym(5), view);
                gyyVar2.a(view, hauVar.q.a());
            }
        });
        hhaVar.c = this.s.b();
        hhaVar.d = this.s.a();
        return new hgz(hhaVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        try {
            if (this.r != null) {
                while (!this.n.isEmpty()) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(0, 0), i2);
                    if (getMeasuredWidth() <= View.MeasureSpec.getSize(i)) {
                        break;
                    }
                    has hasVar = (has) this.n.remove(0);
                    this.r = hasVar;
                    hasVar.a();
                }
                has hasVar2 = this.r;
                if (hasVar2 != null) {
                    hasVar2.a();
                }
            }
            super.onMeasure(i, i2);
        } catch (Throwable th) {
            has hasVar3 = this.r;
            if (hasVar3 != null) {
                hasVar3.a();
            }
            super.onMeasure(i, i2);
            throw th;
        }
    }
}
