package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hfd extends FrameLayout implements hjs {
    public final TextView a;
    public final TextView b;
    public final View c;
    public final maf d;
    private final Button e;
    private final boolean f;
    private boolean g;

    public hfd(Context context, boolean z) {
        super(context);
        inflate(context, R.layout.critical_alert_view, this);
        this.a = (TextView) findViewById(R.id.og_critical_alert_title);
        this.b = (TextView) findViewById(R.id.og_critical_alert_subtitle);
        Button button = (Button) findViewById(R.id.og_critical_alert_action_button);
        this.e = button;
        this.c = findViewById(R.id.og_critical_alert_card_view);
        this.d = new maf(button);
        setFocusable(false);
        int[] iArr = bwn.a;
        setImportantForAccessibility(4);
        this.f = z;
    }

    public static int a(boolean z) {
        if (z) {
            return 109340;
        }
        return 109736;
    }

    @Override // defpackage.hjs
    public final void b(hjp hjpVar) {
        hjpVar.c(this.c, a(this.f));
        hjpVar.c(this.e, 109339);
        this.g = true;
    }

    @Override // defpackage.hjs
    public final void cU(hjp hjpVar) {
        if (!this.g) {
            return;
        }
        hjpVar.e(this.e);
        hjpVar.e(this.c);
        this.g = false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        this.d.d(View.MeasureSpec.getSize(i));
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.e.setOnClickListener(onClickListener);
        this.c.setOnClickListener(onClickListener);
        super.setOnClickListener(new ewu(this, 4));
    }
}
