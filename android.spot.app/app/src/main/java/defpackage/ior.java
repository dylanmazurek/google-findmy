package defpackage;

import android.os.Bundle;
import android.view.View;
import com.google.ar.core.ImageMetadata;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ior extends buk {
    final /* synthetic */ iov a;

    public ior(iov iovVar) {
        this.a = iovVar;
    }

    @Override // defpackage.buk
    public final void c(View view, byn bynVar) {
        super.c(view, bynVar);
        if (this.a.d) {
            bynVar.i(ImageMetadata.SHADING_MODE);
            bynVar.y(true);
        } else {
            bynVar.y(false);
        }
    }

    @Override // defpackage.buk
    public final boolean i(View view, int i, Bundle bundle) {
        if (i == 1048576) {
            iov iovVar = this.a;
            if (!iovVar.d) {
                i = ImageMetadata.SHADING_MODE;
            } else {
                iovVar.cancel();
                return true;
            }
        }
        return super.i(view, i, bundle);
    }
}
