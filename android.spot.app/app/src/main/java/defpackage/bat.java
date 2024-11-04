package defpackage;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bat extends mpe implements moh {
    final /* synthetic */ baw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bat(baw bawVar) {
        super(1);
        this.a = bawVar;
    }

    @Override // defpackage.moh
    public final /* synthetic */ Object a(Object obj) {
        apr aprVar;
        Rect rect;
        boolean requestFocus;
        int i;
        KeyEvent keyEvent = ((att) obj).a;
        long e = la.e(keyEvent);
        boolean z = true;
        if (a.n(e, ats.g)) {
            if (true != keyEvent.isShiftPressed()) {
                i = 1;
            } else {
                i = 2;
            }
            aprVar = new apr(i);
        } else if (a.n(e, ats.e)) {
            aprVar = new apr(4);
        } else if (a.n(e, ats.d)) {
            aprVar = new apr(3);
        } else if (!a.n(e, ats.b) && !a.n(e, ats.j)) {
            if (!a.n(e, ats.c) && !a.n(e, ats.k)) {
                if (!a.n(e, ats.f) && !a.n(e, ats.h) && !a.n(e, ats.l)) {
                    if (!a.n(e, ats.a) && !a.n(e, ats.i)) {
                        aprVar = null;
                    } else {
                        aprVar = new apr(8);
                    }
                } else {
                    aprVar = new apr(7);
                }
            } else {
                aprVar = new apr(6);
            }
        } else {
            aprVar = new apr(5);
        }
        if (aprVar != null && a.m(la.d(keyEvent), 2)) {
            baw bawVar = this.a;
            aql j = bawVar.j();
            Boolean a = bawVar.A.a(aprVar.a, j, new zc(aprVar, 16));
            if (a == null || a.booleanValue()) {
                return true;
            }
            int i2 = aprVar.a;
            if (!a.m(i2, 1) && !a.m(i2, 2)) {
                return false;
            }
            Integer g = ft.g(i2);
            if (g != null) {
                int intValue = g.intValue();
                if (j != null) {
                    rect = arj.a(j);
                } else {
                    rect = null;
                }
                if (rect != null) {
                    baw bawVar2 = this.a;
                    View view = bawVar2;
                    loop0: while (true) {
                        if (view != null) {
                            FocusFinder focusFinder = FocusFinder.getInstance();
                            View rootView = bawVar2.getRootView();
                            rootView.getClass();
                            view = focusFinder.findNextFocus((ViewGroup) rootView, view, intValue);
                            if (view != null) {
                                if (!amr.i(view, bawVar2)) {
                                    for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                                        if (parent == bawVar2) {
                                            break;
                                        }
                                    }
                                    break loop0;
                                }
                                break;
                            }
                        } else {
                            view = null;
                            break;
                        }
                    }
                    if (true == amr.i(view, this.a)) {
                        view = null;
                    }
                    if (view != null) {
                        Integer valueOf = Integer.valueOf(intValue);
                        if (!(view instanceof ViewGroup)) {
                            valueOf.getClass();
                            requestFocus = view.requestFocus(intValue, rect);
                        } else {
                            ViewGroup viewGroup = (ViewGroup) view;
                            if (viewGroup.isFocused()) {
                                return true;
                            }
                            if (viewGroup.isFocusable() && !view.hasFocus()) {
                                valueOf.getClass();
                                requestFocus = view.requestFocus(intValue, rect);
                            } else if (view instanceof baw) {
                                valueOf.getClass();
                                requestFocus = view.requestFocus(intValue, rect);
                            } else {
                                FocusFinder focusFinder2 = FocusFinder.getInstance();
                                valueOf.getClass();
                                View findNextFocusFromRect = focusFinder2.findNextFocusFromRect(viewGroup, rect, intValue);
                                if (findNextFocusFromRect != null) {
                                    valueOf.getClass();
                                    requestFocus = findNextFocusFromRect.requestFocus(intValue, rect);
                                } else {
                                    valueOf.getClass();
                                    requestFocus = view.requestFocus(intValue, rect);
                                }
                            }
                        }
                        if (requestFocus) {
                            return true;
                        }
                    }
                    if (!this.a.A.c(false, false, aprVar.a)) {
                        return true;
                    }
                    Boolean a2 = this.a.A.a(aprVar.a, null, new zc(aprVar, 15));
                    if (a2 != null) {
                        z = a2.booleanValue();
                    }
                    return Boolean.valueOf(z);
                }
                throw new IllegalStateException("Invalid rect");
            }
            throw new IllegalStateException("Invalid focus direction");
        }
        return false;
    }
}
