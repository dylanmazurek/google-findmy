package defpackage;

import android.os.Bundle;
import android.view.View;
import com.google.ar.core.ImageMetadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class iwc extends buk {
    final /* synthetic */ iwh a;

    public iwc(iwh iwhVar) {
        this.a = iwhVar;
    }

    @Override // defpackage.buk
    public final void c(View view, byn bynVar) {
        super.c(view, bynVar);
        bynVar.i(ImageMetadata.SHADING_MODE);
        bynVar.y(true);
    }

    @Override // defpackage.buk
    public final boolean i(View view, int i, Bundle bundle) {
        if (i == 1048576) {
            this.a.e();
            return true;
        }
        return super.i(view, i, bundle);
    }
}
