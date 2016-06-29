package de

import cats.kernel.std.ListInstances
import cats.std.FutureInstances

package object codecentric extends CatsPkg

trait CatsPkg extends ListInstances with FutureInstances