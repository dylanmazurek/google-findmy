package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.adm.R;
import com.google.android.material.progressindicator.LinearProgressIndicator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hdc extends hdn {
    public LinearProgressIndicator x;
    public View y;

    public hdc(ViewGroup viewGroup, Context context, hjp hjpVar) {
        super(viewGroup, context, hjpVar);
    }

    @Override // defpackage.hdn
    protected final View E(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(((hcv) this).r).inflate(R.layout.og_progress_card_content, viewGroup);
        this.y = inflate;
        this.x = (LinearProgressIndicator) inflate.findViewById(R.id.og_card_progress_indicator);
        Context context = ((hcv) this).r;
        LinearProgressIndicator linearProgressIndicator = this.x;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.progress_bar_round_corners);
        itf itfVar = linearProgressIndicator.a;
        if (itfVar.b != dimensionPixelSize) {
            itfVar.b = Math.min(dimensionPixelSize, itfVar.a / 2);
            linearProgressIndicator.invalidate();
        }
        ((iuk) linearProgressIndicator.a).a();
        linearProgressIndicator.invalidate();
        LinearProgressIndicator linearProgressIndicator2 = this.x;
        itf itfVar2 = linearProgressIndicator2.a;
        if (itfVar2.g != 0) {
            itfVar2.g = 0;
            itfVar2.a();
            linearProgressIndicator2.invalidate();
        }
        LinearProgressIndicator linearProgressIndicator3 = this.x;
        iuk iukVar = (iuk) linearProgressIndicator3.a;
        if (iukVar.n != 0) {
            iukVar.n = Math.min(0, iukVar.a);
            ((iuk) linearProgressIndicator3.a).a();
            linearProgressIndicator3.invalidate();
        }
        return this.y;
    }

    @Override // defpackage.hdn, defpackage.hcv
    protected final void F(cfc cfcVar) {
        super.F(cfcVar);
        ((hdj) this.w).getClass();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.hdn
    /* renamed from: I, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void H(cfc cfcVar, hdj hdjVar) {
        super.H(cfcVar, hdjVar);
        throw null;
    }
}
