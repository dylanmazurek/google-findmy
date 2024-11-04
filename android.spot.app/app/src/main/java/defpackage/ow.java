package defpackage;

import android.os.Build;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ow extends mpc implements mnw {
    private final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow(Object obj, int i) {
        super(0, obj, ox.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        this.a = i;
    }

    @Override // defpackage.mnw
    public final /* synthetic */ Object a() {
        ContentCaptureSession a;
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        ((baw) this.c).q();
                        return mlh.a;
                    }
                    View view = (View) this.c;
                    if (Build.VERSION.SDK_INT >= 30) {
                        bej.a(view, 1);
                    }
                    if (Build.VERSION.SDK_INT >= 29 && (a = bei.a(view)) != null) {
                        return new bfi(a, view);
                    }
                    return null;
                }
                apx apxVar = (apx) this.c;
                if (apxVar.c.c() == aqf.Inactive) {
                    apxVar.b.a();
                }
                return mlh.a;
            }
            ((ox) this.c).f();
            return mlh.a;
        }
        ((ox) this.c).f();
        return mlh.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow(Object obj, int i, char[] cArr) {
        super(0, obj, apx.class, "invalidateOwnerFocusState", "invalidateOwnerFocusState()V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow(Object obj, int i, short[] sArr) {
        super(0, obj, bbp.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", 1);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow(Object obj, int i, int[] iArr) {
        super(0, obj, baw.class, "onClearFocusForOwner", "onClearFocusForOwner()V", 0);
        this.a = i;
    }
}
