package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bah extends ViewGroup {
    private WeakReference a;
    private IBinder b;
    private abs c;
    private mnw d;
    private boolean e;
    private boolean f;

    public bah(Context context) {
        this(context, null, 0, 6, null);
    }

    private final void f() {
        if (this.e) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    private final void g(abt abtVar) {
        if (true != h(abtVar)) {
            abtVar = null;
        }
        if (abtVar != null) {
            this.a = new WeakReference(abtVar);
        }
    }

    private static final boolean h(abt abtVar) {
        if ((abtVar instanceof afn) && ((afa) ((afn) abtVar).o.c()).compareTo(afa.ShuttingDown) <= 0) {
            return false;
        }
        return true;
    }

    public abstract void a(abi abiVar, int i);

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        f();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    protected final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        f();
        return super.addViewInLayout(view, i, layoutParams);
    }

    public final void b() {
        abs absVar = this.c;
        if (absVar != null) {
            absVar.b();
        }
        this.c = null;
        requestLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0041, code lost:            if (true != r6) goto L24;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:155:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0123 A[Catch: all -> 0x0255, TryCatch #0 {all -> 0x0255, blocks: (B:5:0x0008, B:7:0x0010, B:9:0x0016, B:11:0x001a, B:16:0x0029, B:19:0x0031, B:21:0x0035, B:23:0x003d, B:26:0x0046, B:28:0x004c, B:29:0x0057, B:30:0x005c, B:32:0x0060, B:34:0x006c, B:37:0x0076, B:39:0x007c, B:40:0x00b7, B:41:0x00b1, B:43:0x00b5, B:44:0x00bb, B:45:0x00c2, B:49:0x00c3, B:51:0x00dd, B:52:0x00fb, B:55:0x0104, B:56:0x0105, B:59:0x010a, B:60:0x010b, B:61:0x010c, B:63:0x0112, B:65:0x011a, B:67:0x0123, B:68:0x0135, B:70:0x014c, B:72:0x0152, B:73:0x015a, B:75:0x0169, B:77:0x0179, B:78:0x017f, B:80:0x0187, B:81:0x018c, B:84:0x01a1, B:85:0x01a5, B:88:0x0201, B:92:0x022f, B:94:0x0235, B:96:0x023c, B:97:0x0245, B:100:0x0241, B:103:0x020c, B:105:0x020f, B:106:0x0223, B:108:0x01ad, B:112:0x01b6, B:144:0x01ba, B:146:0x01c0, B:137:0x01f9, B:114:0x01c6, B:116:0x01cb, B:118:0x01cf, B:120:0x01d7, B:122:0x01dc, B:128:0x01e4, B:130:0x01ed, B:131:0x01f0, B:126:0x01f4, B:148:0x01fe, B:152:0x0250, B:157:0x011d, B:54:0x00fc), top: B:4:0x0008, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014c A[Catch: all -> 0x0255, TryCatch #0 {all -> 0x0255, blocks: (B:5:0x0008, B:7:0x0010, B:9:0x0016, B:11:0x001a, B:16:0x0029, B:19:0x0031, B:21:0x0035, B:23:0x003d, B:26:0x0046, B:28:0x004c, B:29:0x0057, B:30:0x005c, B:32:0x0060, B:34:0x006c, B:37:0x0076, B:39:0x007c, B:40:0x00b7, B:41:0x00b1, B:43:0x00b5, B:44:0x00bb, B:45:0x00c2, B:49:0x00c3, B:51:0x00dd, B:52:0x00fb, B:55:0x0104, B:56:0x0105, B:59:0x010a, B:60:0x010b, B:61:0x010c, B:63:0x0112, B:65:0x011a, B:67:0x0123, B:68:0x0135, B:70:0x014c, B:72:0x0152, B:73:0x015a, B:75:0x0169, B:77:0x0179, B:78:0x017f, B:80:0x0187, B:81:0x018c, B:84:0x01a1, B:85:0x01a5, B:88:0x0201, B:92:0x022f, B:94:0x0235, B:96:0x023c, B:97:0x0245, B:100:0x0241, B:103:0x020c, B:105:0x020f, B:106:0x0223, B:108:0x01ad, B:112:0x01b6, B:144:0x01ba, B:146:0x01c0, B:137:0x01f9, B:114:0x01c6, B:116:0x01cb, B:118:0x01cf, B:120:0x01d7, B:122:0x01dc, B:128:0x01e4, B:130:0x01ed, B:131:0x01f0, B:126:0x01f4, B:148:0x01fe, B:152:0x0250, B:157:0x011d, B:54:0x00fc), top: B:4:0x0008, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0152 A[Catch: all -> 0x0255, TryCatch #0 {all -> 0x0255, blocks: (B:5:0x0008, B:7:0x0010, B:9:0x0016, B:11:0x001a, B:16:0x0029, B:19:0x0031, B:21:0x0035, B:23:0x003d, B:26:0x0046, B:28:0x004c, B:29:0x0057, B:30:0x005c, B:32:0x0060, B:34:0x006c, B:37:0x0076, B:39:0x007c, B:40:0x00b7, B:41:0x00b1, B:43:0x00b5, B:44:0x00bb, B:45:0x00c2, B:49:0x00c3, B:51:0x00dd, B:52:0x00fb, B:55:0x0104, B:56:0x0105, B:59:0x010a, B:60:0x010b, B:61:0x010c, B:63:0x0112, B:65:0x011a, B:67:0x0123, B:68:0x0135, B:70:0x014c, B:72:0x0152, B:73:0x015a, B:75:0x0169, B:77:0x0179, B:78:0x017f, B:80:0x0187, B:81:0x018c, B:84:0x01a1, B:85:0x01a5, B:88:0x0201, B:92:0x022f, B:94:0x0235, B:96:0x023c, B:97:0x0245, B:100:0x0241, B:103:0x020c, B:105:0x020f, B:106:0x0223, B:108:0x01ad, B:112:0x01b6, B:144:0x01ba, B:146:0x01c0, B:137:0x01f9, B:114:0x01c6, B:116:0x01cb, B:118:0x01cf, B:120:0x01d7, B:122:0x01dc, B:128:0x01e4, B:130:0x01ed, B:131:0x01f0, B:126:0x01f4, B:148:0x01fe, B:152:0x0250, B:157:0x011d, B:54:0x00fc), top: B:4:0x0008, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0169 A[Catch: all -> 0x0255, TryCatch #0 {all -> 0x0255, blocks: (B:5:0x0008, B:7:0x0010, B:9:0x0016, B:11:0x001a, B:16:0x0029, B:19:0x0031, B:21:0x0035, B:23:0x003d, B:26:0x0046, B:28:0x004c, B:29:0x0057, B:30:0x005c, B:32:0x0060, B:34:0x006c, B:37:0x0076, B:39:0x007c, B:40:0x00b7, B:41:0x00b1, B:43:0x00b5, B:44:0x00bb, B:45:0x00c2, B:49:0x00c3, B:51:0x00dd, B:52:0x00fb, B:55:0x0104, B:56:0x0105, B:59:0x010a, B:60:0x010b, B:61:0x010c, B:63:0x0112, B:65:0x011a, B:67:0x0123, B:68:0x0135, B:70:0x014c, B:72:0x0152, B:73:0x015a, B:75:0x0169, B:77:0x0179, B:78:0x017f, B:80:0x0187, B:81:0x018c, B:84:0x01a1, B:85:0x01a5, B:88:0x0201, B:92:0x022f, B:94:0x0235, B:96:0x023c, B:97:0x0245, B:100:0x0241, B:103:0x020c, B:105:0x020f, B:106:0x0223, B:108:0x01ad, B:112:0x01b6, B:144:0x01ba, B:146:0x01c0, B:137:0x01f9, B:114:0x01c6, B:116:0x01cb, B:118:0x01cf, B:120:0x01d7, B:122:0x01dc, B:128:0x01e4, B:130:0x01ed, B:131:0x01f0, B:126:0x01f4, B:148:0x01fe, B:152:0x0250, B:157:0x011d, B:54:0x00fc), top: B:4:0x0008, inners: #1 }] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [aow] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [aow] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [aiu] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [aiu] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r17v0, types: [bah, android.view.View, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 602
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bah.c():void");
    }

    protected boolean d() {
        throw null;
    }

    public final void e() {
        mnw azpVar;
        mnw mnwVar = this.d;
        if (mnwVar != null) {
            mnwVar.a();
        }
        if (isAttachedToWindow()) {
            cfc d = bty.d(this);
            if (d != null) {
                azpVar = rd.e(this, d.N());
            } else {
                ll.h(a.af(this, "View tree for ", " has no ViewTreeLifecycleOwner"));
                throw new mks();
            }
        } else {
            mpn mpnVar = new mpn();
            bdt bdtVar = new bdt(this, mpnVar, 1);
            addOnAttachStateChangeListener(bdtVar);
            mpnVar.a = new aqg(this, bdtVar, 5, null);
            azpVar = new azp(mpnVar, 6);
        }
        this.d = azpVar;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        if (this.f && !super.isTransitionGroup()) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        IBinder windowToken = getWindowToken();
        if (this.b != windowToken) {
            this.b = windowToken;
            this.a = null;
        }
        if (d()) {
            c();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        c();
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(childAt.getMeasuredWidth() + getPaddingLeft() + getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        childAt.setLayoutDirection(i);
    }

    @Override // android.view.ViewGroup
    public final void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.f = true;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public bah(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public bah(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setClipChildren(false);
        setClipToPadding(false);
        bba bbaVar = new bba(this, 2);
        addOnAttachStateChangeListener(bbaVar);
        njz njzVar = new njz(this);
        ((ArrayList) brl.c(this).a).add(njzVar);
        this.d = new azm(this, bbaVar, njzVar, 2);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        f();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    protected final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        f();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        f();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        f();
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        f();
        super.addView(view, layoutParams);
    }

    public /* synthetic */ bah(Context context, AttributeSet attributeSet, int i, int i2, moz mozVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
