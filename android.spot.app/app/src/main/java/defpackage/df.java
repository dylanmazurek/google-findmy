package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ViewStubCompat;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.widget.PopupWindow;
import com.google.android.apps.adm.R;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class df extends fu {
    public boolean a;
    public boolean b;
    final /* synthetic */ dn c;
    public njz d;
    private boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public df(dn dnVar, Window.Callback callback) {
        super(callback);
        this.c = dnVar;
    }

    final ActionMode a(ActionMode.Callback callback) {
        Context context;
        fk fkVar = new fk(this.c.k, callback);
        dn dnVar = this.c;
        fi fiVar = dnVar.q;
        if (fiVar != null) {
            fiVar.f();
        }
        db dbVar = new db(dnVar, fkVar);
        ch b = dnVar.b();
        if (b != null) {
            dnVar.q = b.c(dbVar);
        }
        if (dnVar.q == null) {
            dnVar.C();
            fi fiVar2 = dnVar.q;
            if (fiVar2 != null) {
                fiVar2.f();
            }
            if (dnVar.r == null) {
                if (dnVar.B) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = dnVar.k.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme newTheme = dnVar.k.getResources().newTheme();
                        newTheme.setTo(theme);
                        newTheme.applyStyle(typedValue.resourceId, true);
                        context = new ps(dnVar.k, 0);
                        context.getTheme().setTo(newTheme);
                    } else {
                        context = dnVar.k;
                    }
                    dnVar.r = new ActionBarContextView(context);
                    dnVar.s = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    brg.d(dnVar.s, 2);
                    dnVar.s.setContentView(dnVar.r);
                    dnVar.s.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    dnVar.r.e = TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
                    dnVar.s.setHeight(-2);
                    dnVar.t = new w(dnVar, 6, null);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) dnVar.w.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        viewStubCompat.a = LayoutInflater.from(dnVar.s());
                        dnVar.r = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (dnVar.r != null) {
                dnVar.C();
                dnVar.r.i();
                fj fjVar = new fj(dnVar.r.getContext(), dnVar.r, dbVar);
                if (dbVar.c(fjVar, fjVar.a)) {
                    fjVar.g();
                    dnVar.r.h(fjVar);
                    dnVar.q = fjVar;
                    if (dnVar.L()) {
                        dnVar.r.setAlpha(0.0f);
                        bet w = bwn.w(dnVar.r);
                        w.g(1.0f);
                        dnVar.M = w;
                        dnVar.M.i(new cz(dnVar));
                    } else {
                        dnVar.r.setAlpha(1.0f);
                        dnVar.r.setVisibility(0);
                        if (dnVar.r.getParent() instanceof View) {
                            bvz.c((View) dnVar.r.getParent());
                        }
                    }
                    if (dnVar.s != null) {
                        dnVar.l.getDecorView().post(dnVar.t);
                    }
                } else {
                    dnVar.q = null;
                }
            }
            dnVar.G();
        }
        dnVar.G();
        fi fiVar3 = dnVar.q;
        if (fiVar3 == null) {
            return null;
        }
        return fkVar.e(fiVar3);
    }

    public final void b(Window.Callback callback) {
        try {
            this.f = true;
            callback.onContentChanged();
        } finally {
            this.f = false;
        }
    }

    @Override // defpackage.fu, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.a) {
            return this.e.dispatchKeyEvent(keyEvent);
        }
        if (!this.c.H(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.fu, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyShortcutEvent(keyEvent)) {
            dn dnVar = this.c;
            int keyCode = keyEvent.getKeyCode();
            ch b = dnVar.b();
            if (b == null || !b.o(keyCode, keyEvent)) {
                dl dlVar = dnVar.D;
                if (dlVar != null && dnVar.Q(dlVar, keyEvent.getKeyCode(), keyEvent)) {
                    dl dlVar2 = dnVar.D;
                    if (dlVar2 != null) {
                        dlVar2.l = true;
                    }
                } else {
                    if (dnVar.D == null) {
                        dl P = dnVar.P(0);
                        dnVar.K(P, keyEvent);
                        boolean Q = dnVar.Q(P, keyEvent.getKeyCode(), keyEvent);
                        P.k = false;
                        if (!Q) {
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    @Override // defpackage.fu, android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f) {
            this.e.onContentChanged();
        }
    }

    @Override // defpackage.fu, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0) {
            if (!(menu instanceof gh)) {
                return false;
            }
            i = 0;
        }
        return super.onCreatePanelMenu(i, menu);
    }

    @Override // defpackage.fu, android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        View view;
        njz njzVar = this.d;
        if (njzVar != null) {
            if (i == 0) {
                view = new View(((du) njzVar.a).c.a());
                i = 0;
            } else {
                view = null;
            }
            if (view != null) {
                return view;
            }
        }
        return super.onCreatePanelView(i);
    }

    @Override // defpackage.fu, android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        ch b;
        super.onMenuOpened(i, menu);
        if (i == 108 && (b = this.c.b()) != null) {
            b.d(true);
        }
        return true;
    }

    @Override // defpackage.fu, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.b) {
            this.e.onPanelClosed(i, menu);
            return;
        }
        super.onPanelClosed(i, menu);
        dn dnVar = this.c;
        if (i == 108) {
            ch b = dnVar.b();
            if (b != null) {
                b.d(false);
                return;
            }
            return;
        }
        if (i == 0) {
            dl P = dnVar.P(0);
            if (P.m) {
                dnVar.A(P, false);
            }
        }
    }

    @Override // defpackage.fu, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        gh ghVar;
        if (menu instanceof gh) {
            ghVar = (gh) menu;
        } else {
            ghVar = null;
        }
        if (i == 0) {
            if (ghVar == null) {
                return false;
            }
            i = 0;
        }
        if (ghVar != null) {
            ghVar.k = true;
        }
        njz njzVar = this.d;
        if (njzVar != null && i == 0) {
            du duVar = (du) njzVar.a;
            if (!duVar.b) {
                duVar.c.f();
                ((du) njzVar.a).b = true;
            }
            i = 0;
        }
        boolean onPreparePanel = super.onPreparePanel(i, view, menu);
        if (ghVar != null) {
            ghVar.k = false;
        }
        return onPreparePanel;
    }

    @Override // defpackage.fu, android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        gh ghVar = this.c.P(0).h;
        if (ghVar != null) {
            super.onProvideKeyboardShortcuts(list, ghVar, i);
        } else {
            super.onProvideKeyboardShortcuts(list, menu, i);
        }
    }

    @Override // defpackage.fu, android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        if (Build.VERSION.SDK_INT >= 23) {
            return null;
        }
        return this.c.u ? a(callback) : super.onWindowStartingActionMode(callback);
    }

    @Override // defpackage.fu, android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        if (this.c.u && i == 0) {
            return a(callback);
        }
        return super.onWindowStartingActionMode(callback, i);
    }
}
