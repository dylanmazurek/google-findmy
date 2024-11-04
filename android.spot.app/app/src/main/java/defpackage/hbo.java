package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class hbo implements View.OnTouchListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ hbo(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List, java.lang.Object] */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int i = this.b;
        boolean z3 = true;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (motionEvent.getAction() == 1) {
                        ixq ixqVar = (ixq) this.a;
                        if (ixqVar.o()) {
                            ixqVar.c = false;
                        }
                        ixqVar.k();
                        ixqVar.m();
                    }
                    return false;
                }
                int i2 = 0;
                boolean z4 = false;
                while (true) {
                    ?? r4 = this.a;
                    if (i2 >= ((jmi) r4).c) {
                        break;
                    }
                    z4 |= ((View.OnTouchListener) r4.get(i2)).onTouch(view, motionEvent);
                    i2++;
                }
                if (z4) {
                    if (motionEvent.getAction() == 0) {
                        z3 = false;
                    }
                    hwx.V(z3, "Internal onTouchListeners may not consume ACTION_DOWN.");
                }
                return z4;
            }
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0) {
                PopupWindow popupWindow = ((ky) this.a).q;
                if (popupWindow != null && popupWindow.isShowing() && x >= 0 && x < ((ky) this.a).q.getWidth() && y >= 0 && y < ((ky) this.a).q.getHeight()) {
                    ky kyVar = (ky) this.a;
                    kyVar.o.postDelayed(kyVar.r, 250L);
                }
            } else if (action == 1) {
                ky kyVar2 = (ky) this.a;
                kyVar2.o.removeCallbacks(kyVar2.r);
            }
            return false;
        }
        SelectedAccountDisc selectedAccountDisc = (SelectedAccountDisc) this.a;
        View.OnTouchListener onTouchListener = selectedAccountDisc.c;
        if (onTouchListener != null && onTouchListener.onTouch(view, motionEvent)) {
            z = true;
        } else {
            z = false;
        }
        View.OnTouchListener onTouchListener2 = selectedAccountDisc.d;
        if (onTouchListener2 != null && onTouchListener2.onTouch(view, motionEvent)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (selectedAccountDisc.d != null && z) {
            throw new RuntimeException("customOnTouchListener may not consume the event");
        }
        if (z2 || z) {
            return true;
        }
        return false;
    }

    public hbo(ky kyVar, int i) {
        this.b = i;
        this.a = kyVar;
    }
}
