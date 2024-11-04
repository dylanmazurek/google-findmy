package defpackage;

import android.animation.Animator;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import com.google.android.apps.adm.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ipn extends hy {
    private static final int e = 2132019113;
    private static final int[] f = {R.attr.state_indeterminate};
    private static final int[] g = {R.attr.state_error};
    private static final int[][] h = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
    private static final int i = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    ColorStateList b;
    final ColorStateList c;
    public int[] d;
    private final LinkedHashSet j;
    private ColorStateList k;
    private boolean l;
    private final boolean m;
    private final boolean n;
    private final CharSequence o;
    private Drawable p;
    private Drawable q;
    private boolean r;
    private final PorterDuff.Mode s;
    private int t;
    private boolean u;
    private CharSequence v;
    private CompoundButton.OnCheckedChangeListener w;
    private final cnn x;
    private final cni y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ipn(android.content.Context r10, android.util.AttributeSet r11) {
        /*
            r9 = this;
            int r4 = defpackage.ipn.e
            r0 = 2130968841(0x7f040109, float:1.7546347E38)
            android.content.Context r10 = defpackage.iyj.a(r10, r11, r0, r4)
            r9.<init>(r10, r11, r0)
            java.util.LinkedHashSet r10 = new java.util.LinkedHashSet
            r10.<init>()
            java.util.LinkedHashSet r10 = new java.util.LinkedHashSet
            r10.<init>()
            r9.j = r10
            android.content.Context r10 = r9.getContext()
            cnn r10 = defpackage.cnn.b(r10)
            r9.x = r10
            ipk r10 = new ipk
            r10.<init>(r9)
            r9.y = r10
            android.content.Context r10 = r9.getContext()
            android.graphics.drawable.Drawable r0 = defpackage.bqw.b(r9)
            r9.p = r0
            android.content.res.ColorStateList r0 = r9.b
            r6 = 0
            if (r0 == 0) goto L39
            goto L45
        L39:
            android.content.res.ColorStateList r0 = super.getButtonTintList()
            if (r0 == 0) goto L44
            android.content.res.ColorStateList r0 = super.getButtonTintList()
            goto L45
        L44:
            r0 = r6
        L45:
            r9.b = r0
            ia r0 = r9.a
            r7 = 1
            if (r0 == 0) goto L51
            r0.b = r7
            r0.a()
        L51:
            int[] r2 = defpackage.ipo.a
            r3 = 2130968841(0x7f040109, float:1.7546347E38)
            r8 = 0
            int[] r5 = new int[r8]
            r0 = r10
            r1 = r11
            ksr r11 = defpackage.isa.e(r0, r1, r2, r3, r4, r5)
            r0 = 2
            android.graphics.drawable.Drawable r0 = r11.u(r0)
            r9.q = r0
            android.graphics.drawable.Drawable r0 = r9.p
            if (r0 == 0) goto L99
            boolean r0 = defpackage.isa.d(r10)
            if (r0 == 0) goto L99
            int r0 = r11.s(r8, r8)
            int r1 = r11.s(r7, r8)
            int r2 = defpackage.ipn.i
            if (r0 != r2) goto L99
            if (r1 != 0) goto L99
            super.setButtonDrawable(r6)
            r0 = 2131231087(0x7f08016f, float:1.8078245E38)
            android.graphics.drawable.Drawable r0 = defpackage.cu.c(r10, r0)
            r9.p = r0
            r9.r = r7
            android.graphics.drawable.Drawable r0 = r9.q
            if (r0 != 0) goto L99
            r0 = 2131231089(0x7f080171, float:1.807825E38)
            android.graphics.drawable.Drawable r0 = defpackage.cu.c(r10, r0)
            r9.q = r0
        L99:
            r0 = 3
            android.content.res.ColorStateList r10 = defpackage.hzc.ae(r10, r11, r0)
            r9.c = r10
            r10 = 4
            r0 = -1
            int r10 = r11.p(r10, r0)
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r10 = defpackage.a.h(r10, r0)
            r9.s = r10
            r10 = 10
            boolean r10 = r11.z(r10, r8)
            r9.l = r10
            r10 = 6
            boolean r10 = r11.z(r10, r7)
            r9.m = r10
            r10 = 9
            boolean r10 = r11.z(r10, r8)
            r9.n = r10
            r10 = 8
            java.lang.CharSequence r10 = r11.w(r10)
            r9.o = r10
            r10 = 7
            boolean r0 = r11.A(r10)
            if (r0 == 0) goto Ldb
            int r10 = r11.p(r10, r8)
            r9.c(r10)
        Ldb:
            r11.y()
            r9.d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ipn.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private final void d() {
        LayerDrawable layerDrawable;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        cnn cnnVar;
        Animator.AnimatorListener animatorListener;
        this.p = iqh.d(this.p, this.b, bzl.b(this));
        this.q = iqh.d(this.q, this.c, this.s);
        if (this.r) {
            cnn cnnVar2 = this.x;
            if (cnnVar2 != null) {
                cni cniVar = this.y;
                if (cniVar != null) {
                    Drawable drawable = cnnVar2.e;
                    if (drawable != null) {
                        cnm.c((AnimatedVectorDrawable) drawable, cniVar.a());
                    }
                    ArrayList arrayList = cnnVar2.c;
                    if (arrayList != null) {
                        arrayList.remove(cniVar);
                        if (cnnVar2.c.size() == 0 && (animatorListener = cnnVar2.b) != null) {
                            cnnVar2.a.c.removeListener(animatorListener);
                            cnnVar2.b = null;
                        }
                    }
                }
                cnn cnnVar3 = this.x;
                cni cniVar2 = this.y;
                if (cniVar2 != null) {
                    Drawable drawable2 = cnnVar3.e;
                    if (drawable2 != null) {
                        cnm.b((AnimatedVectorDrawable) drawable2, cniVar2.a());
                    } else {
                        if (cnnVar3.c == null) {
                            cnnVar3.c = new ArrayList();
                        }
                        if (!cnnVar3.c.contains(cniVar2)) {
                            cnnVar3.c.add(cniVar2);
                            if (cnnVar3.b == null) {
                                cnnVar3.b = new cnj(cnnVar3);
                            }
                            cnnVar3.a.c.addListener(cnnVar3.b);
                        }
                    }
                }
            }
            if (Build.VERSION.SDK_INT >= 24) {
                Drawable drawable3 = this.p;
                if ((drawable3 instanceof AnimatedStateListDrawable) && (cnnVar = this.x) != null) {
                    ((AnimatedStateListDrawable) drawable3).addTransition(R.id.checked, R.id.unchecked, cnnVar, false);
                    ((AnimatedStateListDrawable) this.p).addTransition(R.id.indeterminate, R.id.unchecked, this.x, false);
                }
            }
        }
        Drawable drawable4 = this.p;
        if (drawable4 != null && (colorStateList2 = this.b) != null) {
            bsc.g(drawable4, colorStateList2);
        }
        Drawable drawable5 = this.q;
        if (drawable5 != null && (colorStateList = this.c) != null) {
            bsc.g(drawable5, colorStateList);
        }
        Drawable drawable6 = this.p;
        Drawable drawable7 = this.q;
        if (drawable6 == null) {
            drawable6 = drawable7;
        } else if (drawable7 != null) {
            int intrinsicWidth = drawable7.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable6.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable7.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable6.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable6.getIntrinsicWidth() || intrinsicHeight > drawable6.getIntrinsicHeight()) {
                float f2 = intrinsicWidth / intrinsicHeight;
                if (f2 >= drawable6.getIntrinsicWidth() / drawable6.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable6.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f2);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable6.getIntrinsicHeight();
                    intrinsicWidth = (int) (f2 * intrinsicHeight);
                }
            }
            if (Build.VERSION.SDK_INT >= 23) {
                layerDrawable = new LayerDrawable(new Drawable[]{drawable6, drawable7});
                layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
                layerDrawable.setLayerGravity(1, 17);
            } else {
                layerDrawable = new LayerDrawable(new Drawable[]{drawable6, drawable7});
                int max = Math.max((drawable6.getIntrinsicWidth() - intrinsicWidth) / 2, 0);
                int max2 = Math.max((drawable6.getIntrinsicHeight() - intrinsicHeight) / 2, 0);
                layerDrawable.setLayerInset(1, max, max2, max, max2);
            }
            drawable6 = layerDrawable;
        }
        super.setButtonDrawable(drawable6);
        refreshDrawableState();
    }

    private final void e() {
        String string;
        if (Build.VERSION.SDK_INT >= 30 && this.v == null) {
            int i2 = this.t;
            if (i2 == 1) {
                string = getResources().getString(R.string.mtrl_checkbox_state_description_checked);
            } else if (i2 == 0) {
                string = getResources().getString(R.string.mtrl_checkbox_state_description_unchecked);
            } else {
                string = getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
            }
            super.setStateDescription(string);
        }
    }

    public final void c(int i2) {
        boolean z;
        Object systemService;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.t != i2) {
            this.t = i2;
            if (i2 == 1) {
                z = true;
            } else {
                z = false;
            }
            super.setChecked(z);
            refreshDrawableState();
            e();
            if (!this.u) {
                this.u = true;
                LinkedHashSet linkedHashSet = this.j;
                if (linkedHashSet != null) {
                    Iterator it = linkedHashSet.iterator();
                    while (it.hasNext()) {
                        ((ipl) it.next()).a();
                    }
                }
                if (this.t != 2 && (onCheckedChangeListener = this.w) != null) {
                    onCheckedChangeListener.onCheckedChanged(this, isChecked());
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    systemService = getContext().getSystemService((Class<Object>) cs$$ExternalSyntheticApiModelOutline0.m61m());
                    AutofillManager m58m = cs$$ExternalSyntheticApiModelOutline0.m58m(systemService);
                    if (m58m != null) {
                        m58m.notifyValueChanged(this);
                    }
                }
                this.u = false;
            }
        }
    }

    @Override // android.widget.CompoundButton
    public final Drawable getButtonDrawable() {
        return this.p;
    }

    @Override // android.widget.CompoundButton
    public final ColorStateList getButtonTintList() {
        return this.b;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        if (this.t == 1) {
            return true;
        }
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.l && this.b == null && this.c == null) {
            this.l = true;
            if (this.k == null) {
                int[][] iArr = h;
                int length = iArr.length;
                int c = iqg.c(this, R.attr.colorControlActivated);
                int c2 = iqg.c(this, R.attr.colorError);
                int c3 = iqg.c(this, R.attr.colorSurface);
                int c4 = iqg.c(this, R.attr.colorOnSurface);
                this.k = new ColorStateList(iArr, new int[]{iqg.f(c3, c2, 1.0f), iqg.f(c3, c, 1.0f), iqg.f(c3, c4, 0.54f), iqg.f(c3, c4, 0.38f), iqg.f(c3, c4, 0.38f)});
            }
            bzl.c(this, this.k);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final int[] onCreateDrawableState(int i2) {
        int[] iArr;
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (this.t == 2) {
            mergeDrawableStates(onCreateDrawableState, f);
        }
        if (this.n) {
            mergeDrawableStates(onCreateDrawableState, g);
        }
        int i3 = 0;
        while (true) {
            int length = onCreateDrawableState.length;
            if (i3 < length) {
                int i4 = onCreateDrawableState[i3];
                if (i4 == 16842912) {
                    iArr = onCreateDrawableState;
                    break;
                }
                if (i4 == 0) {
                    iArr = (int[]) onCreateDrawableState.clone();
                    iArr[i3] = 16842912;
                    break;
                }
                i3++;
            } else {
                int[] copyOf = Arrays.copyOf(onCreateDrawableState, length + 1);
                copyOf[length] = 16842912;
                iArr = copyOf;
                break;
            }
        }
        this.d = iArr;
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void onDraw(Canvas canvas) {
        Drawable b;
        if (this.m && TextUtils.isEmpty(getText()) && (b = bqw.b(this)) != null) {
            int i2 = 1;
            if (true == hwx.o(this)) {
                i2 = -1;
            }
            int width = getWidth() - b.getIntrinsicWidth();
            int save = canvas.save();
            int i3 = (width / 2) * i2;
            canvas.translate(i3, 0.0f);
            super.onDraw(canvas);
            canvas.restoreToCount(save);
            if (getBackground() != null) {
                Rect bounds = b.getBounds();
                bsc.e(getBackground(), bounds.left + i3, bounds.top, bounds.right + i3, bounds.bottom);
                return;
            }
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.n) {
            accessibilityNodeInfo.setText(String.valueOf(accessibilityNodeInfo.getText()) + ", " + String.valueOf(this.o));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ipm)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ipm ipmVar = (ipm) parcelable;
        super.onRestoreInstanceState(ipmVar.getSuperState());
        c(ipmVar.a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        ipm ipmVar = new ipm(super.onSaveInstanceState());
        ipmVar.a = this.t;
        return ipmVar;
    }

    @Override // defpackage.hy, android.widget.CompoundButton
    public final void setButtonDrawable(int i2) {
        setButtonDrawable(cu.c(getContext(), i2));
    }

    @Override // android.widget.CompoundButton
    public final void setButtonTintList(ColorStateList colorStateList) {
        if (this.b == colorStateList) {
            return;
        }
        this.b = colorStateList;
        d();
    }

    @Override // android.widget.CompoundButton
    public final void setButtonTintMode(PorterDuff.Mode mode) {
        ia iaVar = this.a;
        if (iaVar != null) {
            iaVar.a = mode;
            iaVar.c = true;
            iaVar.a();
        }
        d();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void setChecked(boolean z) {
        c(z ? 1 : 0);
    }

    @Override // android.widget.CompoundButton
    public final void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.w = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public final void setStateDescription(CharSequence charSequence) {
        this.v = charSequence;
        if (charSequence == null) {
            e();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        c(!isChecked() ? 1 : 0);
    }

    @Override // defpackage.hy, android.widget.CompoundButton
    public final void setButtonDrawable(Drawable drawable) {
        this.p = drawable;
        this.r = false;
        d();
    }
}
