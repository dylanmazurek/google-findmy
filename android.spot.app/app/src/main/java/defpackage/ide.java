package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowMetrics;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ide implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ide(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [jzb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, jyz] */
    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        Rect rect;
        WindowMetrics currentWindowMetrics;
        switch (this.b) {
            case 0:
                ((jni) ((jni) idt.a.e().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/GattClientImpl", "lambda$connectWithRetries$6", 583, "GattClientImpl.java")).u("GattClient still active for %s", ((idt) this.a).e.a());
                return;
            case 1:
                Object obj = this.a;
                ibf ibfVar = (ibf) obj;
                ibfVar.d = null;
                synchronized (ibfVar.f) {
                    if (((ibf) obj).i.equals(ibe.ACTIVE)) {
                        ((jni) ((jni) ibf.a.e().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/BleScannerImpl", "lambda$scheduleScanStops$3", 342, "BleScannerImpl.java")).r("Reached min native scan time, still scanning.");
                        ((ibf) obj).f(ibe.ACTIVE_OK_TO_STOP);
                    }
                    if (((ibf) obj).i.equals(ibe.ACTIVE_WAITING_TO_STOP)) {
                        ((jni) ((jni) ibf.a.e().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/BleScannerImpl", "lambda$scheduleScanStops$3", 346, "BleScannerImpl.java")).r("Reached min native scan time, stopping scan.");
                        ((ibf) obj).f(ibe.ACTIVE_OK_TO_STOP);
                        ((ibf) obj).h(false);
                    }
                }
                return;
            case 2:
                ((idt) this.a).n();
                return;
            case 3:
                Object obj2 = this.a;
                synchronized (((idt) obj2).j) {
                    if (((idt) obj2).s.g()) {
                        ((idt) obj2).s.c().cancel(false);
                    }
                }
                return;
            case 4:
                ((idm) this.a).c.k(lim.b, null, false);
                return;
            case 5:
                jni jniVar = (jni) ((jni) idw.a.e().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/GattConnectionKeepAliveProcess", "lambda$maybeReconnect$3", 204, "GattConnectionKeepAliveProcess.java");
                Object obj3 = this.a;
                idw idwVar = (idw) obj3;
                kxv kxvVar = idwVar.f.b;
                if (kxvVar == null) {
                    kxvVar = kxv.b;
                }
                jniVar.y("Reconnecting to %s (%s)", kxvVar.a, idwVar.g);
                synchronized (idwVar.b) {
                    ((idw) obj3).d = jdl.a;
                    if (((idw) obj3).e) {
                        return;
                    }
                    ((idw) obj3).b();
                    return;
                }
            case 6:
                Object obj4 = this.a;
                synchronized (((ifh) ((njz) obj4).a).l) {
                    if (((ifh) ((njz) obj4).a).m.g()) {
                        ((ifh) ((njz) obj4).a).b();
                        ((ifh) ((njz) obj4).a).m = jdl.a;
                    }
                }
                return;
            case 7:
                ((jbw) this.a).g();
                return;
            case 8:
                this.a.cancel(false);
                return;
            case 9:
                Object obj5 = this.a;
                synchronized (((ilz) obj5).f) {
                    ((ilz) obj5).g = null;
                    ((ilz) obj5).h = true;
                    synchronized (((ilz) obj5).f) {
                    }
                }
                return;
            case 10:
                ((imw) this.a).b();
                return;
            case 11:
                ioq ioqVar = (ioq) this.a;
                ioqVar.b = false;
                cai caiVar = ioqVar.c.z;
                if (caiVar != null && caiVar.l()) {
                    ioq ioqVar2 = (ioq) this.a;
                    ioqVar2.a(ioqVar2.a);
                    return;
                }
                ioq ioqVar3 = (ioq) this.a;
                BottomSheetBehavior bottomSheetBehavior = ioqVar3.c;
                if (bottomSheetBehavior.y == 2) {
                    bottomSheetBehavior.I(ioqVar3.a);
                    return;
                }
                return;
            case 12:
                ((ite) this.a).e();
                return;
            case 13:
                ite iteVar = (ite) this.a;
                ((itx) iteVar.getCurrentDrawable()).k(false, false, true);
                if (iteVar.getProgressDrawable() == null || !iteVar.getProgressDrawable().isVisible()) {
                    if (iteVar.getIndeterminateDrawable() != null && iteVar.getIndeterminateDrawable().isVisible()) {
                        return;
                    }
                    iteVar.setVisibility(4);
                    return;
                }
                return;
            case 14:
                iwh iwhVar = (iwh) this.a;
                if (iwhVar.j != null && (context = iwhVar.i) != null) {
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (Build.VERSION.SDK_INT >= 30) {
                        currentWindowMetrics = windowManager.getCurrentWindowMetrics();
                        rect = currentWindowMetrics.getBounds();
                    } else {
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        Point point = new Point();
                        defaultDisplay.getRealSize(point);
                        rect = new Rect();
                        rect.right = point.x;
                        rect.bottom = point.y;
                    }
                    Object obj6 = this.a;
                    int height = rect.height();
                    int[] iArr = new int[2];
                    iwh iwhVar2 = (iwh) obj6;
                    iwhVar2.j.getLocationInWindow(iArr);
                    int height2 = height - (iArr[1] + iwhVar2.j.getHeight());
                    int translationY = (int) ((iwh) this.a).j.getTranslationY();
                    iwh iwhVar3 = (iwh) this.a;
                    int i = height2 + translationY;
                    int i2 = iwhVar3.q;
                    if (i >= i2) {
                        iwhVar3.r = i2;
                        return;
                    }
                    ViewGroup.LayoutParams layoutParams = iwhVar3.j.getLayoutParams();
                    if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                        Log.w(iwh.b, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                        return;
                    }
                    iwh iwhVar4 = (iwh) this.a;
                    iwhVar4.r = iwhVar4.q;
                    ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += ((iwh) this.a).q - i;
                    ((iwh) this.a).j.requestLayout();
                    return;
                }
                return;
            case 15:
                ((iwh) this.a).m();
                return;
            case 16:
                iwg iwgVar = ((iwh) this.a).j;
                if (iwgVar == null) {
                    return;
                }
                if (iwgVar.getParent() != null) {
                    ((iwh) this.a).j.setVisibility(0);
                }
                Object obj7 = this.a;
                iwh iwhVar5 = (iwh) obj7;
                if (iwhVar5.j.c == 1) {
                    ValueAnimator c = iwhVar5.c(0.0f, 1.0f);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
                    ofFloat.setInterpolator(iwhVar5.g);
                    ofFloat.addUpdateListener(new ioj(obj7, 4));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(c, ofFloat);
                    animatorSet.setDuration(iwhVar5.c);
                    animatorSet.addListener(new iwd(iwhVar5));
                    animatorSet.start();
                    return;
                }
                int b = iwhVar5.b();
                iwhVar5.j.setTranslationY(b);
                ValueAnimator valueAnimator = new ValueAnimator();
                valueAnimator.setIntValues(b, 0);
                valueAnimator.setInterpolator(iwhVar5.f);
                valueAnimator.setDuration(iwhVar5.e);
                valueAnimator.addListener(new ivy(iwhVar5));
                valueAnimator.addUpdateListener(new ioj(obj7, 5));
                valueAnimator.start();
                return;
            case 17:
                ((ixi) this.a).f(true);
                return;
            case 18:
                ixq ixqVar = (ixq) this.a;
                boolean isPopupShowing = ixqVar.a.isPopupShowing();
                ixqVar.f(isPopupShowing);
                ixqVar.c = isPopupShowing;
                return;
            case 19:
                ((TextInputLayout) this.a).c.requestLayout();
                return;
            default:
                ixt ixtVar = ((TextInputLayout) this.a).b;
                ixtVar.d.performClick();
                ixtVar.d.jumpDrawablesToCurrentState();
                return;
        }
    }

    public ide(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
