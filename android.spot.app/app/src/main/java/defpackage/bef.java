package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bef {
    public static ViewStructure a(ContentCaptureSession contentCaptureSession, View view) {
        ViewStructure newViewStructure;
        newViewStructure = contentCaptureSession.newViewStructure(view);
        return newViewStructure;
    }

    public static ViewStructure b(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
        ViewStructure newVirtualViewStructure;
        newVirtualViewStructure = contentCaptureSession.newVirtualViewStructure(autofillId, j);
        return newVirtualViewStructure;
    }

    public static AutofillId c(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
        AutofillId newAutofillId;
        newAutofillId = contentCaptureSession.newAutofillId(autofillId, j);
        return newAutofillId;
    }

    public static void d(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
        contentCaptureSession.notifyViewAppeared(viewStructure);
    }

    public static void e(ContentCaptureSession contentCaptureSession, AutofillId autofillId, CharSequence charSequence) {
        contentCaptureSession.notifyViewTextChanged(autofillId, charSequence);
    }

    public static void f(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
        contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
    }

    public static final String g(int i, abi abiVar) {
        abiVar.f(AndroidCompositionLocals_androidKt.a);
        return ((Context) abiVar.f(AndroidCompositionLocals_androidKt.b)).getResources().getString(i);
    }

    public static final long h(double d) {
        return k(4294967296L, (float) d);
    }

    public static final long i(float f) {
        return k(4294967296L, f);
    }

    public static final long j(int i) {
        return k(4294967296L, i);
    }

    public static final long k(long j, float f) {
        long floatToIntBits = Float.floatToIntBits(f);
        long j2 = blp.a;
        return j | (floatToIntBits & 4294967295L);
    }

    public static final boolean l(long j) {
        if (blp.b(j) == 0) {
            return true;
        }
        return false;
    }

    public static final long m(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }

    public static final long n(long j) {
        return a.k(blm.b(j), blm.a(j));
    }
}
