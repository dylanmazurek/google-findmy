package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hct extends hcz {
    private ViewGroup z;

    public hct(ViewGroup viewGroup, Context context, hjp hjpVar) {
        super(viewGroup, context, hjpVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.hcv
    public final /* synthetic */ void D(cfc cfcVar, hcu hcuVar) {
        hcs hcsVar = (hcs) hcuVar;
        ViewGroup viewGroup = this.z;
        if (viewGroup == null) {
            super.H(cfcVar, hcsVar);
        } else {
            viewGroup.removeAllViews();
            throw null;
        }
    }

    @Override // defpackage.hcz
    protected final void E(ViewGroup viewGroup) {
        this.z = viewGroup;
        hcu hcuVar = this.w;
        if (hcuVar == null) {
            return;
        }
        throw null;
    }
}
