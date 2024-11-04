package defpackage;

import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bei {
    public static ContentCaptureSession a(View view) {
        ContentCaptureSession contentCaptureSession;
        contentCaptureSession = view.getContentCaptureSession();
        return contentCaptureSession;
    }

    public static final Object b(jyz jyzVar, mmx mmxVar) {
        try {
            if (jyzVar.isDone()) {
                return amr.f(jyzVar);
            }
            mse mseVar = new mse(mjo.w(mmxVar), 1);
            mseVar.z();
            jyzVar.c(new cri(jyzVar, mseVar, 1), bmk.a);
            mseVar.d(new bco(jyzVar, 7));
            return mseVar.j();
        } catch (ExecutionException e) {
            throw c(e);
        }
    }

    public static final Throwable c(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        cause.getClass();
        return cause;
    }

    public static jyz d(bmh bmhVar) {
        bmf bmfVar = new bmf();
        bmj bmjVar = new bmj(bmfVar);
        bmfVar.b = bmjVar;
        bmfVar.a = bmhVar.getClass();
        try {
            Object a = bmhVar.a(bmfVar);
            if (a != null) {
                bmfVar.a = a;
            }
        } catch (Exception e) {
            bmjVar.a(e);
        }
        return bmjVar;
    }
}
