package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.google.android.apps.adm.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class nm implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static nm a;
    public static nm b;
    public final View c;
    private final CharSequence d;
    private final int e;
    private final Runnable f = new nl(this, 0);
    private final Runnable g = new nl(this, 2);
    private int h;
    private int i;
    private boolean j;
    private boolean k;
    private ilv l;

    public nm(View view, CharSequence charSequence) {
        int scaledTouchSlop;
        this.c = view;
        this.d = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        if (Build.VERSION.SDK_INT >= 28) {
            scaledTouchSlop = bwq.a(viewConfiguration);
        } else {
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop() / 2;
        }
        this.e = scaledTouchSlop;
        d();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(nm nmVar) {
        nm nmVar2 = a;
        if (nmVar2 != null) {
            nmVar2.c.removeCallbacks(nmVar2.f);
        }
        a = nmVar;
        if (nmVar != null) {
            nmVar.c.postDelayed(nmVar.f, ViewConfiguration.getLongPressTimeout());
        }
    }

    private final void d() {
        this.k = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        if (b == this) {
            b = null;
            ilv ilvVar = this.l;
            if (ilvVar != null) {
                ilvVar.y();
                this.l = null;
                d();
                this.c.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (a == this) {
            b(null);
        }
        this.c.removeCallbacks(this.g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(boolean z) {
        int height;
        int i;
        int i2;
        int i3;
        long longPressTimeout;
        long j;
        long j2;
        if (!this.c.isAttachedToWindow()) {
            return;
        }
        b(null);
        nm nmVar = b;
        if (nmVar != null) {
            nmVar.a();
        }
        b = this;
        this.j = z;
        ilv ilvVar = new ilv(this.c.getContext());
        this.l = ilvVar;
        View view = this.c;
        int i4 = this.h;
        int i5 = this.i;
        boolean z2 = this.j;
        CharSequence charSequence = this.d;
        if (ilvVar.z()) {
            ilvVar.y();
        }
        ((TextView) ilvVar.d).setText(charSequence);
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) ilvVar.c;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = ((Context) ilvVar.g).getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i4 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = ((Context) ilvVar.g).getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
            height = i5 + dimensionPixelOffset2;
            i = i5 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i = 0;
        }
        layoutParams.gravity = 49;
        Resources resources = ((Context) ilvVar.g).getResources();
        if (z2) {
            i2 = R.dimen.tooltip_y_offset_touch;
        } else {
            i2 = R.dimen.tooltip_y_offset_non_touch;
        }
        int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i2);
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
        if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
            Context context = view.getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof Activity) {
                    rootView = ((Activity) context).getWindow().getDecorView();
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (rootView == null) {
            Log.e("TooltipPopup", "Cannot find app view");
        } else {
            rootView.getWindowVisibleDisplayFrame((Rect) ilvVar.e);
            if (((Rect) ilvVar.e).left < 0 && ((Rect) ilvVar.e).top < 0) {
                Resources resources2 = ((Context) ilvVar.g).getResources();
                int identifier = resources2.getIdentifier("status_bar_height", "dimen", "android");
                if (identifier != 0) {
                    i3 = resources2.getDimensionPixelSize(identifier);
                } else {
                    i3 = 0;
                }
                DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
                ((Rect) ilvVar.e).set(0, i3, displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
            rootView.getLocationOnScreen((int[]) ilvVar.a);
            view.getLocationOnScreen((int[]) ilvVar.f);
            int[] iArr = (int[]) ilvVar.f;
            int i6 = iArr[0];
            int[] iArr2 = (int[]) ilvVar.a;
            int i7 = i6 - iArr2[0];
            iArr[0] = i7;
            iArr[1] = iArr[1] - iArr2[1];
            layoutParams.x = (i7 + i4) - (rootView.getWidth() / 2);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            ((View) ilvVar.b).measure(makeMeasureSpec, makeMeasureSpec);
            int measuredHeight = ((View) ilvVar.b).getMeasuredHeight();
            int i8 = ((int[]) ilvVar.f)[1];
            int i9 = ((i + i8) - dimensionPixelOffset3) - measuredHeight;
            int i10 = i8 + height + dimensionPixelOffset3;
            if (z2) {
                if (i9 >= 0) {
                    layoutParams.y = i9;
                } else {
                    layoutParams.y = i10;
                }
            } else if (measuredHeight + i10 <= ((Rect) ilvVar.e).height()) {
                layoutParams.y = i10;
            } else {
                layoutParams.y = i9;
            }
        }
        ((WindowManager) ((Context) ilvVar.g).getSystemService("window")).addView((View) ilvVar.b, (ViewGroup.LayoutParams) ilvVar.c);
        this.c.addOnAttachStateChangeListener(this);
        if (this.j) {
            j2 = 2500;
        } else {
            View view2 = this.c;
            int[] iArr3 = bwn.a;
            if ((view2.getWindowSystemUiVisibility() & 1) == 1) {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j = 3000;
            } else {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j = 15000;
            }
            j2 = j - longPressTimeout;
        }
        this.c.removeCallbacks(this.g);
        this.c.postDelayed(this.g, j2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0066, code lost:            if (java.lang.Math.abs(r1) > r3.e) goto L26;     */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onHover(android.view.View r4, android.view.MotionEvent r5) {
        /*
            r3 = this;
            ilv r4 = r3.l
            r0 = 0
            if (r4 == 0) goto L9
            boolean r4 = r3.j
            if (r4 != 0) goto L71
        L9:
            android.view.View r4 = r3.c
            android.content.Context r4 = r4.getContext()
            java.lang.String r1 = "accessibility"
            java.lang.Object r4 = r4.getSystemService(r1)
            android.view.accessibility.AccessibilityManager r4 = (android.view.accessibility.AccessibilityManager) r4
            boolean r1 = r4.isEnabled()
            if (r1 == 0) goto L23
            boolean r4 = r4.isTouchExplorationEnabled()
            if (r4 != 0) goto L71
        L23:
            int r4 = r5.getAction()
            r1 = 7
            if (r4 == r1) goto L36
            r5 = 10
            if (r4 == r5) goto L2f
            goto L71
        L2f:
            r3.d()
            r3.a()
            goto L71
        L36:
            android.view.View r4 = r3.c
            boolean r4 = r4.isEnabled()
            if (r4 == 0) goto L71
            ilv r4 = r3.l
            if (r4 != 0) goto L71
            float r4 = r5.getX()
            int r4 = (int) r4
            float r5 = r5.getY()
            int r5 = (int) r5
            boolean r1 = r3.k
            if (r1 != 0) goto L68
            int r1 = r3.h
            int r1 = r4 - r1
            int r2 = r3.e
            int r1 = java.lang.Math.abs(r1)
            if (r1 > r2) goto L68
            int r1 = r3.i
            int r1 = r5 - r1
            int r2 = r3.e
            int r1 = java.lang.Math.abs(r1)
            if (r1 <= r2) goto L71
        L68:
            r3.h = r4
            r3.i = r5
            r3.k = r0
            b(r3)
        L71:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nm.onHover(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.h = view.getWidth() / 2;
        this.i = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
