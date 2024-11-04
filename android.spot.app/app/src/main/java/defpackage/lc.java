package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.support.v7.view.menu.ListMenuItemView;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lc extends kb {
    final int c;
    final int d;
    public kz e;
    private MenuItem f;

    public lc(Context context, boolean z) {
        super(context, z);
        int i;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        if (layoutDirection == 1) {
            i = 21;
        } else {
            i = 22;
        }
        this.c = i;
        this.d = layoutDirection == 1 ? 22 : 21;
    }

    @Override // defpackage.kb, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        ge geVar;
        int i;
        gj gjVar;
        kz kzVar;
        kz kzVar2;
        int pointToPosition;
        int i2;
        if (this.e != null) {
            ListAdapter adapter = getAdapter();
            int i3 = 0;
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                geVar = (ge) headerViewListAdapter.getWrappedAdapter();
            } else {
                geVar = (ge) adapter;
                i = 0;
            }
            hxh hxhVar = null;
            if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < geVar.getCount()) {
                gjVar = geVar.getItem(i2);
            } else {
                gjVar = null;
            }
            MenuItem menuItem = this.f;
            if (menuItem != gjVar) {
                gh ghVar = geVar.a;
                if (menuItem != null && (kzVar2 = ((ld) this.e).b) != null) {
                    ((ga) kzVar2).a.a.removeCallbacksAndMessages(ghVar);
                }
                this.f = gjVar;
                if (gjVar != null && (kzVar = ((ld) this.e).b) != null) {
                    ga gaVar = (ga) kzVar;
                    gaVar.a.a.removeCallbacksAndMessages(null);
                    int size = gaVar.a.b.size();
                    while (true) {
                        if (i3 < size) {
                            if (ghVar == ((hxh) gaVar.a.b.get(i3)).c) {
                                break;
                            }
                            i3++;
                        } else {
                            i3 = -1;
                            break;
                        }
                    }
                    if (i3 != -1) {
                        int i4 = i3 + 1;
                        if (i4 < gaVar.a.b.size()) {
                            hxhVar = (hxh) gaVar.a.b.get(i4);
                        }
                        gaVar.a.a.postAtTime(new bxi(gaVar, hxhVar, gjVar, ghVar, 1), ghVar, SystemClock.uptimeMillis() + 200);
                    }
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ge geVar;
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.c) {
            if (listMenuItemView.isEnabled() && listMenuItemView.a.hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView != null && i == this.d) {
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                geVar = (ge) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            } else {
                geVar = (ge) adapter;
            }
            geVar.a.i(false);
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }
}
