package defpackage;

import android.graphics.Canvas;
import android.graphics.Region;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ixl extends ixm {
    public ixl(ixk ixkVar) {
        super(ixkVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ivf
    public final void H(Canvas canvas) {
        if (this.a.x.isEmpty()) {
            super.H(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT < 26) {
            canvas.clipRect(this.a.x, Region.Op.DIFFERENCE);
        } else {
            canvas.clipOutRect(this.a.x);
        }
        super.H(canvas);
        canvas.restore();
    }
}
