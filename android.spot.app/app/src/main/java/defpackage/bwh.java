package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bwh {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static View.AccessibilityDelegate a(View view) {
        View.AccessibilityDelegate accessibilityDelegate;
        accessibilityDelegate = view.getAccessibilityDelegate();
        return accessibilityDelegate;
    }

    static ContentCaptureSession b(View view) {
        ContentCaptureSession contentCaptureSession;
        contentCaptureSession = view.getContentCaptureSession();
        return contentCaptureSession;
    }

    static List c(View view) {
        List systemGestureExclusionRects;
        systemGestureExclusionRects = view.getSystemGestureExclusionRects();
        return systemGestureExclusionRects;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
    }

    static void e(View view, bzc bzcVar) {
        if (bzcVar == null) {
            view.setContentCaptureSession(null);
            return;
        }
        throw null;
    }

    static void f(View view, List list) {
        view.setSystemGestureExclusionRects(list);
    }

    public static final Object g(chx chxVar, String str, mmx mmxVar) {
        Object a = chxVar.a(str, bas.s, mmxVar);
        if (a == mne.a) {
            return a;
        }
        return mlh.a;
    }
}
