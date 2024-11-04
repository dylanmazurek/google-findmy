package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cls extends cmd {
    private static final String[] w = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    private static final Property x = new clk(PointF.class);
    private static final Property y = new cll(PointF.class);
    private static final Property z = new clm(PointF.class);
    private static final Property A = new cln(PointF.class);
    private static final Property B = new clo(PointF.class);

    private static final void e(cmn cmnVar) {
        View view = cmnVar.b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        cmnVar.a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        cmnVar.a.put("android:changeBounds:parent", cmnVar.b.getParent());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0121 A[RETURN] */
    @Override // defpackage.cmd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.Animator a(android.view.ViewGroup r20, defpackage.cmn r21, defpackage.cmn r22) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cls.a(android.view.ViewGroup, cmn, cmn):android.animation.Animator");
    }

    @Override // defpackage.cmd
    public final void b(cmn cmnVar) {
        e(cmnVar);
    }

    @Override // defpackage.cmd
    public final void c(cmn cmnVar) {
        e(cmnVar);
    }

    @Override // defpackage.cmd
    public final String[] d() {
        return w;
    }
}
