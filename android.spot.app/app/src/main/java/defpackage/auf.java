package defpackage;

import android.view.MotionEvent;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class auf {
    public final List a;
    public final int b;
    public int c;
    private final bfi d;

    public auf(List list) {
        this(list, null);
    }

    public final MotionEvent a() {
        bfi bfiVar = this.d;
        if (bfiVar != null) {
            return (MotionEvent) ((bfi) bfiVar.a).b;
        }
        return null;
    }

    public auf(List list, bfi bfiVar) {
        this.a = list;
        this.d = bfiVar;
        MotionEvent a = a();
        int i = 0;
        this.b = a != null ? a.getButtonState() : 0;
        MotionEvent a2 = a();
        if (a2 != null) {
            a2.getMetaState();
        }
        MotionEvent a3 = a();
        if (a3 != null) {
            int actionMasked = a3.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 8:
                                i = 6;
                                break;
                            case 9:
                                i = 4;
                                break;
                            case 10:
                                i = 5;
                                break;
                        }
                    }
                    i = 3;
                }
                i = 2;
            }
            i = 1;
        } else {
            int size = list.size();
            while (i < size) {
                aum aumVar = (aum) list.get(i);
                if (lb.h(aumVar)) {
                    i = 2;
                } else if (lb.f(aumVar)) {
                    i = 1;
                } else {
                    i++;
                }
            }
            i = 3;
        }
        this.c = i;
    }
}
