package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bop {
    public bop() {
    }

    public static int s(Context context, String str, String str2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return bpd.b((AppOpsManager) bpd.c(context, AppOpsManager.class), str, str2);
        }
        return 1;
    }

    public static Executor t(boolean z) {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new cpj(z));
        newFixedThreadPool.getClass();
        return newFixedThreadPool;
    }

    public boolean d(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public boolean e(CoordinatorLayout coordinatorLayout, View view, int i) {
        return false;
    }

    public boolean f(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
        return false;
    }

    public boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public boolean h(View view) {
        return false;
    }

    public boolean k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        return false;
    }

    public boolean l(View view) {
        return false;
    }

    public void n(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        iArr[0] = iArr[0] + i2;
        iArr[1] = iArr[1] + i3;
    }

    public Parcelable p(View view) {
        return View.BaseSavedState.EMPTY_STATE;
    }

    public boolean q(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
        return false;
    }

    public boolean r(View view, Rect rect) {
        return false;
    }

    public bop(Context context, AttributeSet attributeSet) {
    }

    public bop(byte[] bArr) {
    }

    public void b() {
    }

    public void a(bos bosVar) {
    }

    public void j(CoordinatorLayout coordinatorLayout, View view) {
    }

    public void o(View view, Parcelable parcelable) {
    }

    public void i(CoordinatorLayout coordinatorLayout, View view, View view2) {
    }

    public void c(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
    }

    public void m(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int[] iArr, int i2) {
    }
}
